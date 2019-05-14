package homework_6;

import java.util.*;

public class Family_Tree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String searchedPersonData = input.nextLine();
		Person2 searchedPerson = new Person2();

		Map<String, Person2> personByName = new HashMap<>();
		Map<String, Person2> personByBirthday = new HashMap<>();

		List<String> allInputData = new ArrayList<>();

		String command = input.nextLine();
		while (!"End".equalsIgnoreCase(command)) {
			if (command.contains("-")) {
				allInputData.add(command);
			} else {
				String[] personData = command.split("\\s+");
				String name = personData[0] + " " + personData[1];
				String birthday = personData[2];

				if (name.equalsIgnoreCase(searchedPersonData) || birthday.equalsIgnoreCase(searchedPersonData)) {
					searchedPerson.setName(name);
					searchedPerson.setBirthday(birthday);
				} else {
					Person2 person = new Person2(name, birthday);
					personByName.put(name, person);
					personByBirthday.put(birthday, person);
				}
			}
			command = input.nextLine();
		}

		for (String data : allInputData) {
			String[] tokens = data.split(" - ");
			if (tokens[0].equalsIgnoreCase(searchedPerson.getName())
					|| tokens[0].equalsIgnoreCase(searchedPerson.getBirthday())
					|| tokens[1].equalsIgnoreCase(searchedPerson.getName())
					|| tokens[1].equalsIgnoreCase(searchedPerson.getBirthday())) {
				String parentData = tokens[0];
				String childData = tokens[1];

				if (childData.equalsIgnoreCase(searchedPerson.getName())
						|| childData.equalsIgnoreCase(searchedPerson.getBirthday())) {
					Person2 parent = null;

					if (personByName.containsKey(parentData)) {
						parent = personByName.get(parentData);
					}
					if (personByBirthday.containsKey(parentData)) {
						parent = personByBirthday.get(parentData);
					}

					searchedPerson.addParent(parent);
				} else if (parentData.equalsIgnoreCase(searchedPerson.getName())
						|| parentData.equalsIgnoreCase(searchedPerson.getBirthday())) {
					Person2 child = null;

					if (personByName.containsKey(childData)) {
						child = personByName.get(childData);
					}
					if (personByBirthday.containsKey(childData)) {
						child = personByBirthday.get(childData);
					}

					searchedPerson.addChild(child);
				}
			}
		}

		System.out.println(searchedPerson);
		System.out.println("Parents: ");
		for (Person2 person : searchedPerson.getParents()) {
			System.out.println(person);
		}
		System.out.println("Children: ");
		for(Person2 person:searchedPerson.getChildren()) {
			System.out.println(person);
		}
	}

}

class Person2 {

	private String name = "";
	private String birthday = "";
	private List<Person2> parents = new ArrayList<>();
	private List<Person2> children = new ArrayList<>();

	public Person2() {
	}

	public Person2(String name, String birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public List<Person2> getParents() {
		return parents;
	}

	public void setParents(List<Person2> parents) {
		this.parents = parents;
	}

	public List<Person2> getChildren() {
		return children;
	}

	public void setChildren(List<Person2> children) {
		this.children = children;
	}

	public void addParent(Person2 person) {
		this.getParents().add(person);
	}

	public void addChild(Person2 child) {
		this.getChildren().add(child);
	}

	@Override
	public String toString() {
		return this.getName() + " " + this.getBirthday();
	}

}
