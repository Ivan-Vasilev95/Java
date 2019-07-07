package Controller;

import java.util.List;
import java.io.File;
import java.io.IOException;

import GUI.FormEvent;
import Model.AgeCategory;
import Model.DataBase;
import Model.EmploymentCategory;
import Model.Gender;
import Model.Person;

public class Controller {
	DataBase db = new DataBase();
	
	public List<Person>getPeople(){
		return db.getPeople();
	}

	public void removePerson(int index) {
		db.removePerson(index);
	}
	public void addPerson(FormEvent e) {

		String name = e.getName();
		String occupation = e.getOccupation();
		int ageCatId = e.getAgeCategory();
		String empCat = e.getEmployment();
		boolean Citizenship = e.isUsCitizen();
		String Country = e.getTaxID();
		String gender = e.getGender();

		AgeCategory ageCategory=null;

		switch (ageCatId) {
		case 0:
			ageCategory = AgeCategory.child;
			break;
		case 1:
			ageCategory = AgeCategory.adult;
			break;
		case 2:
			ageCategory = AgeCategory.sinior;
			break;
		}

		EmploymentCategory empCategory;
		if (empCat.equals("Employed")) {
			empCategory = EmploymentCategory.employed;
		} else if (empCat.equals("Self-employed")) {
			empCategory = EmploymentCategory.selfemployed;
		} else if (empCat.equals("Unemployed")) {
			empCategory = EmploymentCategory.unemployed;
		} else {
			empCategory = EmploymentCategory.other;
		}

		Gender genderCat;
		if(gender.equals("Male")) {
			genderCat=Gender.male;
		}else {
			genderCat=Gender.female;
		}
		
		Person person = new Person(name, occupation, ageCategory, empCategory, 
				Country, Citizenship,genderCat);
		db.AddPerson(person);

	}
	
	public void saveToFIle(File file) throws IOException {
		db.saveToFile(file);
	}
	
	public void loadFromFile(File file)throws IOException {
		db.loadFromFile(file);
	}

}
