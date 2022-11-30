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
			} else if (userChoice == 2) {
				Nested.Nests(in);
			} else if (userChoice == 3) {
				Operators.Operators(in);
			} else if (userChoice == 4) {
				Repetition.Repetitions(in);
			} else if (userChoice == 5) {
				Selection.Selections(in);
			} else if (userChoice == 6) {
				Subprograms.Subprograms(in);
			} else if (userChoice == 7) {
				Variables.Variables(in);
			} else if (userChoice == 8) {
				System.exit(0);
			} else {
				System.out.println("Try Again?");
			}
		}
	}

}
