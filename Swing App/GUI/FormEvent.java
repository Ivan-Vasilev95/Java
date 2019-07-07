package GUI;

import java.util.EventObject;

public class FormEvent extends EventObject {

	private String name;
	private String occupation;
	private int ageCategory;
	private String Employment;
	private String Country;
	private boolean usCitizen;
	private String gender;

	public FormEvent(Object source) {
		super(source);
	}

	public FormEvent(Object source, String name, String occupation, int AgeCat, String Employment, String Country,
			boolean usCitizen,String gender) {
		super(source);
		this.name = name;
		this.occupation = occupation;
		this.ageCategory = AgeCat;
		this.Employment = Employment;
		this.Country = Country;
		this.usCitizen = usCitizen;
		this.gender=gender;
	}

	public String getGender() {
		return gender;
	}
	
	public String getTaxID() {
		return Country;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getAgeCategory() {
		return ageCategory;
	}

	public String getEmployment() {
		return Employment;
	}
}
