package homework_6;

import java.util.HashMap;
import java.util.Map;

public class Google {

	public static void main(String[] args) {
		Map<String, Name> linkedHashMap = new HashMap<>();

		Name info[] = new Name[5];
		info[0] = new Name("Dimitur");
		info[1] = info[0].new company("Google", "Manager", 2000);
		info[2] = info[0].new car("Audi", 130);
		info[3] = info[0].new parents("James", "03/05/1987", "Anna", "07/09/1988");
		info[4] = info[0].new children("Martin", "02/01/2005");

		for (int i = 0; i < info.length; i++) {
			linkedHashMap.put(info[i].getKey(), info[i]);
		}

		for (Map.Entry<String, Name> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.toString());
		}
	}

}

class Name {
	private String name;

	Name(String name) {
		this.name = name;
	}

	public String getKey() {
		return "1";
	}

	public String toString() {
		return this.name + ":\n ";
	}

	class parents extends Name {
		private String parent_name1;
		private String parent_birth1;
		private String parent_name2;
		private String parent_birth2;

		parents(String parent_name1, String parent_birth1, String parent_name2, String parent_birth2) {
			super("");
			if (!parent_name1.isEmpty())
				this.parent_name1 = parent_name1;
			else
				this.parent_name1 = "n/a";

			if (!parent_birth1.isEmpty())
				this.parent_birth1 = parent_birth1;
			else
				this.parent_birth1 = "n/a";

			if (!parent_name2.isEmpty())
				this.parent_name2 = parent_name2;
			else
				this.parent_name2 = "n/a";

			if (!parent_birth2.isEmpty())
				this.parent_birth2 = parent_birth1;
			else
				this.parent_birth2 = "n/a";
		}

		public String toString() {
			return "Parents:\n" + this.parent_name1 + " " + this.parent_birth1 + "\n" + this.parent_name2 + " "
					+ this.parent_birth2;
		}

		public String getKey() {
			return "2";
		}
	}

	class company extends Name {
		private String company_name;
		private String company_position;
		private double salary;

		company(String company_name, String company_position, double salary) {
			super("");
			if (!company_name.isEmpty())
				this.company_name = company_name;
			else
				this.company_name = "n/a";

			if (!company_position.isEmpty())
				this.company_position = company_position;
			else
				this.company_position = "n/a";

			if (salary > 0)
				this.salary = salary;
			else
				System.out.println("Salary cant be 0 or less");

		}

		public String toString() {
			return "Work place:\n" + this.company_name + " " + this.company_position + " " + this.salary;
		}

		public String getKey() {
			return "3";
		}
	}

	class car extends Name {
		private String car_model;
		private double power;

		car(String car_model, double power) {
			super("");
			if (!car_model.isEmpty())
				this.car_model = car_model;
			else
				this.car_model = "n/a";

			if (power > 0)
				this.power = power;
			else
				System.out.println("Car power cant be 0 or less");
		}

		public String toString() {
			return "Car:\n" + this.car_model + " " + this.power;
		}

		public String getKey() {
			return "4";
		}
	}

	class children extends Name {
		private String child_name;
		private String child_birth;

		children(String child_name, String child_birth) {
			super("");
			if (!child_name.isEmpty())
				this.child_name = child_name;
			else
				this.child_name = "n/a";

			if (!child_birth.isEmpty())
				this.child_birth = child_birth;
			else
				this.child_birth = "n/a";
		}

		public String toString() {
			return "Kids:\n" + this.child_name + " " + this.child_birth;
		}

		public String getKey() {
			return "5";
		}
	}

}