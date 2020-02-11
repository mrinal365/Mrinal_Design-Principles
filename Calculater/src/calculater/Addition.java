package calculater;

import java.util.Scanner;

public class Addition {

	public static void add(double a,double b) {
		Scanner sc=new Scanner(System.in);
		DAOInterface daoi= new CalculationDAO();
		System.out.println(daoi.addition(a, b));
	}

}

