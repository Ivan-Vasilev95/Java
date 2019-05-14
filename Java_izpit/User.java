package Java_izpit;

public class User implements Comparable {

	private String Email;
	private String Tech;
	
	public User() {}
	
	public User(String Email, String Tech) {
		this.Email = Email;
		this.Tech = Tech;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getTech() {
		return Tech;
	}

	public void setTech(String Tech) {
		this.Tech = Tech;
	}

	@Override
	public int compareTo(Object o) {
		return Tech.compareTo(((User) o).getTech());
	}


	@Override
	public boolean equals(Object obj) {
		return (Tech.compareTo(((User) obj).getTech()) == 0);
	}

	@Override
	public String toString() {
		return "User [Email=" + Email + ", Tech=" + Tech + "]";
	}
	
	
	
}
