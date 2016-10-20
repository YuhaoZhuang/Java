import java.util.Scanner;
public class Lesson42

{ 	


	public static void main (String[]args)
	{
		//user inputs (fix numbers)
		Scanner k = new Scanner(System.in);
		
		System.out.println("Please enter your interest rate:" );
		double r = k.nextDouble();	
		System.out.println("Please enter your amount of money:" );
		double p = k.nextDouble();		
		
		System.out.println("Please enter number of times compounded each year:" );
		double n = k.nextDouble();		
	
		System.out.println("life of loan in years" );
		double t = k.nextDouble();		
		System.out.println("You owe me: " +print(r,p,n,t));
	
		
	}
	
	public static double print(double a, double s, double d, double f)
	{
		//formatting statement
		return (s*Math.pow(1+a/d, d*f));
	}
	
}