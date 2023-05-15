import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		gamePlay();
		
	}
	
	public static void gamePlay() {
		int round = 0;
		int choice, compChoice;
		int tie = 0;
		int userWin = 0;
		int compWin = 0;

		Scanner in = new Scanner(System.in);

		do {
			System.out.println("How many rounds do you want to play? Please enter a valid number from 1-10");
			String input = in.nextLine();
			round = Integer.parseInt(input);
		} while (round < 1 || round > 10);

		for (int i = 0; i < round; i++) {
			
			do {
			System.out.println("Enter a valid choice: 1 = Rock, 2 = Paper, 3 = Scissors");
			String input = in.nextLine();
			choice = Integer.parseInt(input);
			} while (choice < 0 || choice >3);

			Random rng = new Random();
			compChoice = rng.nextInt(2) + 1;
			computerChoice(compChoice);

			if (choice == compChoice) {
				System.out.println("You are tied!");
				tie++;
			} else if ((choice == 1 && compChoice == 2) || (choice == 1 && compChoice == 3)
					|| (choice == 2 && compChoice == 1 || (choice == 3 && compChoice == 2))) {
				System.out.println("You won!");
				userWin++;
			} else {
				System.out.println("You lose :(");
				compWin++;
			}
		}
		
		System.out.println("Ties: " +tie);
		System.out.println("Wins: " +userWin);
		System.out.println("Loses: " +compWin);
		
		System.out.println("Do you want to play again? (y/n) ");
		String input = in.nextLine();
		if (input.equalsIgnoreCase("y")) {
			gamePlay();
		} else {
			System.out.println("Thanks for playing!");
		}
	}

	public static void computerChoice(int cc) {

		switch (cc) {
		case 1:
			System.out.println("Computer has chosen Rock.");
			break;
		case 2:
			System.out.println("Computer has chosen Paper.");
			break;
		case 3:
			System.out.println("Computer has chosen Scissors.");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}
}
