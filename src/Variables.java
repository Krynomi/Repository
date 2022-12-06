import java.util.*;
public class Variables {
	public static void Variables(Scanner in) {
		System.out.println("Give me an integer");
		int Integer=in.nextInt();
		System.out.println("Give me a double");
		double Double=in.nextDouble();
		System.out.println("Give me a string");
		String VariableString=in.nextLine();
		
		int RevisedInteger = (int)Double;
		double RevisedDouble = (double)Integer;
		
		System.out.println("The converted double is "+RevisedInteger);
		System.out.println("The original int is "+RevisedInteger+" and the converted double is now "+RevisedDouble);
		System.out.println("The new string is "+VariableString.toUpperCase());
		System.out.println(VariableString.substring(0,3));
		System.out.println(VariableString.substring(3,VariableString.length()-1));
		
		
		// I believe there's a mistake in the program? is says "The original int is (revisedinteger)"...
	}
}
