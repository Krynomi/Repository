import java.util.Scanner;

public class ArrayWork {

	public static void Arrays(Scanner in) {
		System.out.println("How long would you like your array to be?");
		int ArraySize = in.nextInt();
		double[] Numbers = new double[ArraySize];
		for (int r = 0; r != ArraySize; r++) {
			System.out.println("Please give me a number");
			double ChosenNumber = in.nextDouble();
			Numbers[0 + r] = ChosenNumber;
		}
		for (int r = 0; r <= Numbers.length - 1; r++) {
			System.out.print(Numbers[r]);
			if (r != Numbers.length - 1) {
				System.out.print(", ");
			}
		}

		java.util.Arrays.sort(Numbers);
		double Average = Numbers[0];
		for (int a = 1; a <= Numbers.length - 1; a++) {
			Average = Average + Numbers[a];
		}
		Average = Average / Numbers.length;
		System.out.println();
		System.out.println("The max value is " + Numbers[Numbers.length - 1]);
		System.out.println("The min value is " + Numbers[0]);
		System.out.println("The average value is " + Average);

		System.out.println("Let me sort that out for you");
		for (int r = 0; r <= Numbers.length - 1; r++) {
			System.out.print(Numbers[r]);
			if (r != Numbers.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}
