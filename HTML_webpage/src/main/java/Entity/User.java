package Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import Entity.Skills;
import Entity.Address;

@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
public class User {

	private int id;
	private String email;
	private String pass;

	private String name;
	private String job;
	private String info;

	@XmlElementWrapper(name = "jobSkills")
	@XmlElement(name = "Skills")
	private ArrayList<Skills> jobSkills;
	@XmlElementWrapper(name = "personalSkills")
	@XmlElement(name = "Skills")
	private ArrayList<Skills> personalSkills;

	private String phone;
	private Address address;

	public User() {
		this(null, null);
	}

	public User(String email, String pass) {
		this.email = email;
		this.pass = pass;

		this.jobSkills = new ArrayList<Skills>();
		this.personalSkills = new ArrayList<Skills>();
		this.address = new Address();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<Skills> getJobSkills() {
		return jobSkills;
	}

	public void addJobSkills(Skills skill) {
		jobSkills.add(skill);
	}

	public ArrayList<Skills> getPersonalSkills() {
		return personalSkills;
	}

	public void addPersonalSkills(Skills skill) {
		personalSkills.add(skill);
	}

	public void setJobSkills(ArrayList<Skills> jobSkills) {
		this.jobSkills = jobSkills;
	}

	public void setPersonalSkills(ArrayList<Skills> personalSkills) {
		this.personalSkills = personalSkills;
	}

	public User update(User obj) {

		this.setName(obj.getName());
		this.setJob(obj.getJob());
		this.setInfo(obj.getInfo());

		this.setPhone(obj.getPhone());
		this.setEmail(obj.getEmail());
		this.setAddress(obj.getAddress());

		this.setJobSkills(obj.getJobSkills());
		this.setPersonalSkills(obj.getPersonalSkills());

		return this;
	}

	public User updateUserInfo(User obj) {

		this.setName(obj.getName());
		this.setJob(obj.getJob());
		this.setInfo(obj.getInfo());

		return this;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(this instanceof User))
			return false;
		User other = (User) obj;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 31;
		int result = 1;
		result = hash * result + ((pass == null) ? 0 : pass.hashCode());
		result = hash * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	public User updateUserSkills(Map<String, String> skills) {

		Map<String, String> mapJobSkills = new HashMap<String, String>();
		Map<String, String> mapPersonalSkills = new HashMap<String, String>();

		for (Map.Entry<String, String> entry : skills.entrySet()) {
			if (entry.getKey().contains("Jskillname")) {
				mapJobSkills.put(entry.getKey(), entry.getValue());
			} else {
				mapPersonalSkills.put(entry.getKey(), entry.getValue());
			}
		}

		ArrayList<Skills> jobSkills = new ArrayList<Skills>();
		ArrayList<Skills> personalSkills = new ArrayList<Skills>();

		for (int i = 0; i < mapJobSkills.size() / 2; i++) {
			Skills newSkills = new Skills(mapJobSkills.get("Jskillname" + i),
					Integer.parseInt(mapJobSkills.get("Jskillvalue" + i)));

			jobSkills.add(newSkills);
		}

		for (int i = 0; i < mapPersonalSkills.size() / 2; i++) {
			Skills newSkills = new Skills(mapPersonalSkills.get("Pskillname" + i),
					Integer.parseInt(mapPersonalSkills.get("Pskillvalue" + i)));

			personalSkills.add(newSkills);
		}

		this.setJobSkills(jobSkills);
		this.setPersonalSkills(personalSkills);
		return this;
	}

	public User updateUserContacts(User obj) {

		this.setPhone(obj.getPhone());
		this.setEmail(obj.getEmail());
		this.setAddress(obj.getAddress());

		return this;
	}

}