package Java_izpit;

import java.util.*;

import java.io.*;

public class SIG implements CreateGroup {

	private String name;
	private List<User> user = new ArrayList<>();

	public SIG(String name) {
		Scanner in;
		try {
			in = new Scanner(new FileReader(name));
			String line;
			try {
				while ((line = in.nextLine()) != null) {
					String cols[] = line.split(" ");
					if (cols.length == 2) {
						User us = new User(cols[0], cols[1]);
						user.add(us);
					}
				}
			} catch (NoSuchElementException e) {
				// EOF
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	@Override
	public List<String> CreateGroupList(String Tech) {
		List<User> temp = new ArrayList<User>();
		temp.addAll(user);
		List<String> list = new ArrayList<String>();
		for (User st : temp) {
			if (Tech.equalsIgnoreCase(st.getTech())) {
				list.add(st.getEmail());
			}
		}
		return list;
	}

	@Override
	public String toString() {
		return "SIG [name=" + name + ", user=" + user + "]";
	}

	public List<User> PrintFile() {
		List<User> list = new ArrayList<User>();
		list.addAll(user);
		return list;
	}

	public List<String> GetAllTech(List<User> list,List<String>newList) {
		Set<String> s = new HashSet<String>();

		for (User st : list) {
			s.add(st.getTech());
		}
		newList.addAll(s);
		
		return newList;
	}

	public static void Users_from_given_Tech(List<User> list, String Tech) {
		for (User st : list) {
			if (Tech.equalsIgnoreCase(st.getTech()))
				System.out.println(st.getEmail());
		}

	}

}
