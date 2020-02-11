package calculater;

import java.util.Scanner;

public class Subtraction {

	public static void sub(double a,double b) {
		Scanner sc=new Scanner(System.in);
		DAOInterface daoi= new CalculationDAO();
		System.out.println(daoi.subtraction(a, b));

	}

}
