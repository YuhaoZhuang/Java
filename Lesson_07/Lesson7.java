import java.util.Scanner;

public class Lesson7
{
	static int a;
	static int b= 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number.");
		a = kb.nextInt();
		
		we ();
		
		System.out.println("The sum of the digits in " + a + " is " + b);
		
	}
	public static void we()
	{
		int num = a;
		while (num > 0)
		{
			b += num % 10;
			num /= 10;
		}
	}
}