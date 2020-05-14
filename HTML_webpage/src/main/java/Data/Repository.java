package Data;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import javax.xml.bind.JAXBException;
import Entity.Address;
import Entity.Skills;
import Entity.User;

public class Repository {

	static Repository instance = null;
	HashSet<User> users = new HashSet<User>();
	static int index = 1;
	private String filename = "C:\\Users\\Ivan Vasilev\\eclipse-workspace-java\\HTML_webpage\\src\\main\\webapp\\storage\\users.xml";

	private Repository() {
		XMLWorker worker = new XMLWorker();
		try {
			UserList userList = worker.readerFromXMLFile(filename);
			users.addAll(userList.getUserBeans());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		index=users.size() + 1;
	}

	/*private  Repositoryyyy() {
		new User("Ivan", "123");
		new User("Niki", "123");

		users.add(new User("ivan@gmail.com", "123") {
			{
				setId(index++);
				setName("Ivan");
				setJob("Софтуерен Инженер");
				setInfo("Известен  факт е, че читателя обръща внимание на сърдържанието, което чете, а\r\n"
						+ "	не на оформлението му. Свойството на Lorem Ipsum е, че до голяма\r\n"
						+ "	степен има нормално разпределение на буквите и се чети по-лесно,за\r\n"
						+ "	разлика от нормален текст на английски език.");
				addJobSkills(new Skills("Java", 50));
				addJobSkills(new Skills("HTML", 20));
				addJobSkills(new Skills("CSS", 25));
				addJobSkills(new Skills("JavaScript", 10));
				addPersonalSkills(new Skills("Communicative", 5));
				addPersonalSkills(new Skills("Teamwork", 10));
				addPersonalSkills(new Skills("Creativity", 25));
				setPhone("0899803089");
				setAddress(new Address("Varna", "Studentska"));
			}
		});

		users.add(new User("niki@gmail.com", "123") {
			{
				setId(index++);
				setName("Niki");
				setJob("Софтуерен специалист");
				setInfo("Известен " + " факт е, че читателя обръща внимание на сърдържанието, което чете, а"
						+ " не на оформлението му. Свойството на Lorem Ipsum е, че до голяма"
						+ " степен има нормално разпределение на буквите и се чети по-лесно,за"
						+ " разлика от нормален текст на английски език.");
				addJobSkills(new Skills("Java", 20));
				addJobSkills(new Skills("HTML", 40));
				addJobSkills(new Skills("CSS", 15));
				addJobSkills(new Skills("JavaScript", 20));
				addPersonalSkills(new Skills("Communicative", 50));
				addPersonalSkills(new Skills("Teamwork", 30));
				addPersonalSkills(new Skills("Creativity", 25));
				setPhone("0899803090");
				setAddress(new Address("Varna", "Studentska"));
			}
		});
	}*/

	static public Repository getInstance() {
		if (instance == null)
			instance = new Repository();
		return instance;
	}

	public void addUser(User user) {
		user.setId(index++);
		users.add(user);
		update();
	}

	public User getById(int id) {
		User user = null;
		for (User userB : users) {
			if (id == userB.getId())
				user = userB;
		}
		return user;
	}

	public boolean hasExist(User user) {
		return users.contains(user);
	}

	public User getUserByEmail(String email) {
		for (User user : users) {
			if (email.equals(user.getEmail())) {
				return user;
			}
		}
		return null;
	}

	public boolean checkUserByEmail(String email) {
		for (User user : users) {
			if (email.equals(user.getEmail())) {
				return true;
			}
		}
		return false;
	}

	public HashSet<User> getUsers() {

		return users;
	}

	public void update() {
		XMLWorker worker = new XMLWorker();
		try {
			worker.writeToXMLFile(filename, users);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
