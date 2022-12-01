import java.util.*;

public class Operators {
	public static void Operators(Scanner in) {
		System.out.println("You chose operators! Give me a number");
		int originalNumber = in.nextInt();
		int currentNumber = 0;
		currentNumber = originalNumber;
		System.out.println("You chose "+currentNumber+"!");
		System.out.println(currentNumber+" - 1 = "+(currentNumber-1));
		currentNumber = currentNumber-1;
		System.out.println(currentNumber+" x 3 = "+currentNumber*3);
		currentNumber = currentNumber*3;
		System.out.println(currentNumber+" + 12 = "+(currentNumber+12));
		currentNumber = currentNumber+12;
		System.out.println(currentNumber+" / 3 = "+currentNumber/3);
		currentNumber = currentNumber/3;
		System.out.println(currentNumber+" + 5 = "+(currentNumber+5));
		currentNumber = currentNumber + 5;
		System.out.println(currentNumber +" - "+originalNumber +" = "+(currentNumber-originalNumber));
		currentNumber = currentNumber-originalNumber;
		System.out.println(currentNumber);
		
	}
}
