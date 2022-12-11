import java.util.*;

public class Nested {
	public static void Nests(Scanner in) {
		System.out.println("Number 1:");
		int NestedNumberOne = in.nextInt();
		System.out.println("Number 2:");
		int NestedNumberTwo = in.nextInt();
		System.out.println();

		// Makes #1 the lower number
		if (NestedNumberTwo < NestedNumberOne) {
			int temp = NestedNumberTwo;
			NestedNumberTwo = NestedNumberOne;
			NestedNumberOne = temp;

		}

		// Line 1
		System.out.print("X\t");
		for (int r = 0; (NestedNumberOne + r) <= NestedNumberTwo; r++) {
			System.out.print((NestedNumberOne + r) + "\t");
		}

		// Rest
		for (int r = 0; r != (NestedNumberTwo - NestedNumberOne + 1); r++) {
			System.out.println();
			System.out.print((NestedNumberOne+r)+"\t");
			
			for(int r2=0;r2<=NestedNumberTwo - NestedNumberOne;r2++) {
				System.out.print((((NestedNumberOne+r)*(NestedNumberOne+r2)))+"\t");
			}

		}
	}
}

