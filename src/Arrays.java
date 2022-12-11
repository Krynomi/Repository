import java.util.*;

public class Arrays {

	public static void Array(Scanner in) {
		System.out.println("How long would you like your array to be?");
		int ArraySize = in.nextInt();
		double[] Numbers = new double[ArraySize];
		for (int r = 0; r != ArraySize; r++) {
			System.out.println("Please give me a number");
			double ChosenNumber = in.nextDouble();
			Numbers[0+r] = ChosenNumber;
		}
		for (int r = 0; r<Numbers.length-1;r++) {
			System.out.print(Numbers[r]);
			System.out.print(", ");
		}
		System.out.print(Numbers[Numbers.length-1]);
		System.out.println("\nLet me sort that out for you");
		
		/* Progress: Set a process for initializing the array
		 * it prints the array. I forgot how to sort the array
		 * and it also doesn't print the min, max or average yet
		 */
	}

}
