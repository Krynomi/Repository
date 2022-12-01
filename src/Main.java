import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int userChoice = 0;
		while (userChoice > 8 || userChoice < 1) {
			System.out.println("Please select of the following options");
			System.out.println(
					"1. Arrays \n2. Nested Loops\n3. Operators\n4. Repetition\n5. Selections\n6. Subprograms\n7. Variables\n8. Quit");
			userChoice = in.nextInt();
			if (userChoice == 1) {
				Arrays.Arrays(in);
				userChoice = 0;
			} else if (userChoice == 2) {
				Nested.Nests(in);
				userChoice = 0;
			} else if (userChoice == 3) {
				Operators.Operators(in);
				userChoice = 0;
			} else if (userChoice == 4) {
				Repetition.Repetitions(in);
				userChoice = 0;
			} else if (userChoice == 5) {
				Selection.Selections(in);
				userChoice = 0;
			} else if (userChoice == 6) {
				Subprograms.Subprograms(in);
				userChoice = 0;
			} else if (userChoice == 7) {
				Variables.Variables(in);
				userChoice = 0;
			} else if (userChoice == 8) {
				System.exit(0);
			} else {
				System.out.println("Try Again?");
			}
		}
	}

}

/*
1. Arrays 
2. Nested Loops
3. Operators = Done
4. Repetition
5. Selections
6. Subprograms
7. Variables
 */
