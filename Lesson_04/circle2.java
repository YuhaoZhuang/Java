import java.util.Scanner;
public class circle2

{ 	
	static double a;




	public static void main (String[]args)
	{
		//user inputs (fix numbers)
		Scanner k = new Scanner(System.in);
		
		System.out.println("Please enter your l:" );
		a = k.nextDouble();	
		print();
		gg();
		
		
	}
	
	public static double print()
	{
		return ((a*a)*3.14);

	}
	public static void gg()
	{
		System.out.printf("The are of your cube with radius of " +a+ " is %.5f:" ,print() );

	}
	
}
