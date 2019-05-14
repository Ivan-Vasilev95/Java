package homework_6;

import java.util.Scanner;

public class Footbal_Team_Generator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the team name: ");
		String team_name = input.nextLine();
		Team team = new Team(team_name);

		System.out.print("How many players you would like to add: ");
		int players_count = input.nextInt();

		Player player[] = new Player[players_count];
		for (int i = 0; i < player.length; i++) {
			System.out.print("Enter player name: ");
			input.nextLine();
			String player_name = input.nextLine();
			System.out.print("Enter player endurance: ");
			double endurance = input.nextDouble();
			System.out.print("Enter sprint: ");
			double sprint = input.nextDouble();
			System.out.print("Enter player dribble: ");
			double dribble = input.nextDouble();
			System.out.print("Enter player passing: ");
			double passing = input.nextDouble();
			System.out.print("Enter player shooting: ");
			double shooting = input.nextDouble();
			player[i] = team.add(player_name, endurance, sprint, dribble, passing, shooting);
		}
		System.out.print("Do you wonna remove a player?(yes/no): ");
		input.nextLine();
		String check_delete = input.nextLine();
		if (check_delete.equalsIgnoreCase("yes")) {
			System.out.print("enter player name: ");
			String delete_player = input.nextLine();
			for (int i = 0; i < player.length; i++) {
				if (player[i].getName().equalsIgnoreCase(delete_player) && player[i] != null) {
					player[i] = team.delete_obj();
				}
			}
		}
		double rating = 0;
		for (int i = 0; i < player.length; i++) {
			if (player[i] != null) {
				rating += player[i].getSinglePlayerScore();
			}
		}
		System.out.println("Team Score\n" + team.getName() + " " + rating);
		input.close();
	}

}

class Player {
	private String name;
	private double endurance;
	private double sprint;
	private double dribble;
	private double passing;
	private double shooting;

	Player(String name, double endurance, double sprint, double dribble, double passing, double shooting) {
		if (name.isEmpty())
			System.out.println("Player name cant be empty");
		else
			this.name = name;

		if (endurance >= 0 && endurance <= 100)
			this.endurance = endurance;
		else
			System.out.println("Endurance must be between 0 and 100");

		if (sprint >= 0 && sprint <= 100)
			this.sprint = sprint;
		else
			System.out.println("Sprint must be between 0 and 100");

		if (dribble >= 0 && dribble <= 100)
			this.dribble = dribble;
		else
			System.out.println("Dribble must be between 0 and 100");

		if (passing >= 0 && passing <= 100)
			this.passing = passing;
		else
			System.out.println("Passing must be between 0 and 100");

		if (shooting >= 0 && shooting <= 100)
			this.shooting = shooting;
		else
			System.out.println("Shooting must be between 0 and 100");
	}

	public double getSinglePlayerScore() {
		return (endurance + sprint + dribble + passing + shooting) / 5;
	}

	public String getName() {
		return name;
	}
}

class Team {
	private String name;

	Team(String name) {

		if (name.isEmpty())
			System.out.println("Team name cant be empty");
		else
			this.name = name;
	}

	public Player add(String name, double endurance, double sprint, double dribble, double passing, double shooting) {
		return new Player(name, endurance, sprint, dribble, passing, shooting);
	}

	public Player delete_obj() {
		return null;
	}

	public String getName() {
		return name;
	}
}