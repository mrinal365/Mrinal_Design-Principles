package calculater;

import java.util.Scanner;

public class CalculatorView {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("MENU");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Division");
			System.out.println("4.Multiplication");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			double a,b;
			 switch(choice)
			 {
			 case 1:
				 System.out.println("Enter two numbers:");
				 a=sc.nextDouble();
				 b=sc.nextDouble();
				 Addition.add(a, b);
				 break;
			 case 2:
				 System.out.println("Enter two numbers:");
				 a=sc.nextDouble();
				 b=sc.nextDouble();
				 Subtraction.sub(a, b);
				 break;
			 case 3:
				 System.out.println("Enter two numbers:");
				 a=sc.nextDouble();
				 b=sc.nextDouble();
				 Division.div(a, b);
				 break;
			 case 4:
				 System.out.println("Enter two numbers:");
				 a=sc.nextDouble();
				 b=sc.nextDouble();
				 Multiplication.mul(a, b);
				 break;
			 case 5:
				 System.out.println("ThankYou");
				 System.exit(0);
			default:
				 System.out.println("Invlaid Choice!!Try Again!!");
			 }
		}

	}

}
