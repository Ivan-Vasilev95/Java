package Entity;

public class User {

	private String email;
	private String pass;
	private String name;

	public User(String email, String pass, String name) {
		this.email = email;
		this.pass = pass;
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public String getPass() {
		return pass;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof User))
			return false;
		if (obj == this)
			return true;
		if (this.getEmail() == ((User) obj).getEmail() && this.getPass() == ((User) obj).getPass())
			return true;
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 53 * hash + (this.email != null ? this.email.hashCode() : 0);
		return hash;
	}
}