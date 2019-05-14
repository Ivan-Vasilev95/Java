package homework_6;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Person {

	public static void main(String[] args) {

		Set<Person_info> set = new TreeSet<>();

		set.add(new Person_info("Kevin", 11));
		set.add(new Person_info("Mike", 22));
		set.add(new Person_info("Anna", 13));
		set.add(new Person_info("Ivan", 24));
		set.add(new Person_info("Nikol", 33));
		set.add(new Person_info("Victor", 54));
		set.add(new Person_info("Anita", 76));

		Set<Person_info> filteredSet = set.stream().filter(s -> s.AgeFilter(30)).collect(Collectors.toSet());

		for (Person_info n : filteredSet)
			System.out.println(n);

	}

}

class Person_info implements Comparable<Person_info> {
	private String name;
	private int age;

	Person_info() {
	}

	Person_info(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public Boolean AgeFilter(double age) {
		if(this.age>age)
			return true;
		else
			return false;
	}

	public String toString() {
		return this.name + " " + this.age;

	}

	public int compareTo(Person_info otherPerson) {
		return this.name.compareTo(otherPerson.getName());
	}

}