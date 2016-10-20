import java.util.Scanner;
public class average2

{ 	
	static double a;
	static double b;
	static double c;
	static double d;


	public static void main (String[]args)
	{
		//user inputs (fix numbers)
		Scanner k = new Scanner(System.in);
		
		System.out.println("Please enter your 1:" );
		a = k.nextDouble();	
		System.out.println("Please enter your 2:" );
		b = k.nextDouble();	
		System.out.println("Please enter your 3:" );
		c = k.nextDouble();				
		print();
		gg();
		
		
	}
	
	public static double print()
	{
		return (a+b+c)/3;

	}
	public static void gg()
	{
		System.out.printf("The average of" +a+", "+b+", " +c+" is " +print());

	}
	
}
