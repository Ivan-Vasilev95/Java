package Data;

import java.util.HashSet;
import Entity.User;

public class DataCollection {

	HashSet<User> data = new HashSet<User>();

	public void AddData(String email, String pass, String name) {

		data.add(new User(email, pass, name));
	}

	public String CheckData(String email, String pass) {

		String name = "";

		for (User temp : data) {

			if (temp.getEmail().equals(email) && temp.getPass().equals(pass))
				name = temp.getName();
		}
		return name;
	}

}
