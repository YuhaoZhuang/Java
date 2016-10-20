import java.util.Scanner;
public class Lesson45

{ 	
	static double a;
	static double b;



	public static void main (String[]args)
	{
		//user inputs (fix numbers)
		Scanner k = new Scanner(System.in);
		
		System.out.println("Please enter your l:" );
		a = k.nextDouble();	
		print();
		gg();
		
		
	}
	
	public static void print()
	{
		b=((a*a)*6);

	}
	public static void gg()
	{
		System.out.printf("The perimeer of cube with length " +a+ " is %.5f:" ,b );

	}
	
}
