import java.util.Scanner;

public class Lesson71
{
	static int number = 234;
	static double average = 0;
	static int digits = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		avgDigits();
		
		System.out.println("The avg of the digits in " + number + " is " + average);
	}
	
	public static void avgDigits()
	{
		int num = number;
		
		while (num > 0)
		{
			digits ++;
			average += num % 10;
			num /= 10;
		}
		
		average /= digits;
	}
	
}