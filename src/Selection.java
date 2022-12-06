import java.util.*;

public class Selection {
	public static void Selections(Scanner in) {
		System.out.println("Enter a $ value");
		double money = in.nextDouble();
		double Tax = 0;
		if (money <= 49020) {
			Tax = (0.15*money);
		} else if (money <=98040) {
			Tax = (0.15*49020)+(0.205*(money-49020));
		} else if (money<=151978) {
			Tax = (0.15*49020)+(0.205*(98040-49020))+(0.26*(money-98040));
		} else if (money<=216511) {
			Tax = (0.15*49020)+(0.205*(98040-49020))+(0.26*(151978-98040))+(0.29*(money-151978));
		} else if (money>216511) {
			Tax = (0.15*49020)+(0.205*(98040-49020))+(0.26*(151978-98040))+(0.29*(216511-151978))+(0.33*(money-216511));
		}
		System.out.println("The tax on $"+money+" is "+Tax+"$");
		System.out.println();
	}
}