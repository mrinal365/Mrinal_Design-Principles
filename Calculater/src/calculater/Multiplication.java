package calculater;

import java.util.Scanner;

public class Multiplication {

	public static void mul(double a,double b) {
		Scanner sc=new Scanner(System.in);
		DAOInterface daoi= new CalculationDAO();
		System.out.println(daoi.multiplication(a, b));
	}

}
