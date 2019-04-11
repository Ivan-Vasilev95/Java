package Lab11;

import java.io.*;
import java.text.*;
import java.util.*;

public class Applicant_info {

	public static void main(String[] args) {
		StudentGroup s = new StudentGroup(
				"C:\\Users\\Ivan Vasilev\\eclipse-workspace-java\\Java-OOP-upr7\\src\\Lab11\\inF.txt",
				"C:\\Users\\Ivan Vasilev\\eclipse-workspace-java\\Java-OOP-upr7\\src\\Lab11\\outF.txt");
		s.read();
		s.write();
		List<Student> list = s.getList();
		for (Student st : list)
			System.out.println(st);

	}

}

interface IOInterface {
	public void read();

	public void write();
}

class Applicant {
	private String name;
	private GregorianCalendar dateOfBird;
	private double avarage_grade;

	public Applicant(String name, GregorianCalendar dateOfBird, double avarage_grade) {
		this.name = name;
		this.dateOfBird = dateOfBird;
		this.avarage_grade = avarage_grade;
	}

	public GregorianCalendar getDateOfBird() {
		return dateOfBird;
	}

	public void setDateOfBird(GregorianCalendar dateOfBird) {
		this.dateOfBird = dateOfBird;
	}

	public double getAvarage_grade() {
		return avarage_grade;
	}

	public void setAvarage_grade(double avarage_grade) {
		this.avarage_grade = avarage_grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Applicant name=" + name + ", dateOfBird=" + new Date(dateOfBird.getTimeInMillis()) + ", avarageGrades="
				+ avarage_grade;
	}
}

class Student extends Applicant implements Comparable<Student> {
	private String fnum;

	public Student(String name, GregorianCalendar dateOfBird, double avarage_grade, String fnum) {
		super(name, dateOfBird, avarage_grade);
		this.fnum = fnum;
	}

	public String getFnum() {
		return fnum;
	}

	public void setFnum(String fnum) {
		this.fnum = fnum;
	}

	boolean equals(Student s) {
		return this.fnum == s.fnum;
	}

	public String toString() {
		return "Student fnum= " + fnum + " "+super.toString();
	}

	@Override
	public int compareTo(Student o) {
		return (int) (getDateOfBird().getTimeInMillis() - o.getDateOfBird().getTimeInMillis());
		// return getDateOfBird().compareTo(o.getDateOfBird());
	}

}

class StudentGroup implements IOInterface {
	private Set<Student> student = new TreeSet<Student>();
	private String inF;
	private String outF;

	public StudentGroup(String inF, String outF) {
		this.inF = inF;
		this.outF = outF;
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	public String getInF() {
		return inF;
	}

	public void setInF(String inF) {
		this.inF = inF;
	}

	public String getOutF() {
		return outF;
	}

	public void setOutF(String outF) {
		this.outF = outF;
	}

	public ArrayList<Student> getList() {
		ArrayList<Student> list = new ArrayList<Student>();
		list.addAll(student);
		return list;
	}

	@Override
	public String toString() {
		return "StudentGroup [student=" + student + ", inF=" + inF + ", outF=" + outF + "]";
	}

	@Override
	public void read() {
		Scanner in;
		try {
			SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
			in = new Scanner(new FileReader(inF));
			String line;
			try {
				while ((line = in.nextLine()) != null) {

					String cols[] = line.split(" ");
					if (cols.length == 4) {
						GregorianCalendar bd = (GregorianCalendar) GregorianCalendar.getInstance();
						bd.setTime(format.parse(cols[3]));
						Student st = new Student(cols[0], bd, Double.valueOf(cols[1]), cols[2]);
						student.add(st);
					}
				}
			} catch (NoSuchElementException e) {
				// EOF
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void write() {
		PrintWriter writer;
		try {
			writer = new PrintWriter(outF, "UTF-8");
			for (Student st : student)
				writer.println(st);
			writer.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}