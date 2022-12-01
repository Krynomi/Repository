import java.util.*;

public class Repetition {
	public static void Repetitions(Scanner in) {
		Random num = new Random();
		int Number1 = num.nextInt(10);
		int Number2 = num.nextInt(10);
		int Number3 = num.nextInt(10);
		int RandomNumber1 = num.nextInt(10);
		int RandomNumber2 = num.nextInt(10);
		int RandomNumber3 = num.nextInt(10);
		int reps = 0;

		for (reps = 1; Number1 != RandomNumber1 && Number2 != RandomNumber2 && Number3 != RandomNumber3; reps++) {
			Number1 = num.nextInt(10);
			Number2 = num.nextInt(10);
			Number3 = num.nextInt(10);
		}
		System.out.println("The original values are "+RandomNumber1+", "+RandomNumber2+", "+RandomNumber3);
		System.out.println("It took "+reps+" tries to get a match");
	}
}
