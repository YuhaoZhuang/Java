import java.util.Scanner;
public class Rectangle2

{ 	
	static double a;
	static double b;
	static double c;


	public static void main (String[]args)
	{
		//user inputs (fix numbers)
		Scanner k = new Scanner(System.in);
		
		System.out.println("Please enter your l:" );
		a = k.nextDouble();	
		System.out.println("Please enter your w:" );
		b = k.nextDouble();		
		print();
		gg();
		
		
	}
	
	public static double print()
	{
		return (a+b)*2;

	}
	public static void gg()
	{
		System.out.printf("The perimeer of rectangle is %.5f:" ,print() );

	}
	
}