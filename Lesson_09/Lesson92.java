import java.util.Scanner;

public class Lesson92
{

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int[] numbers = new int[10];
		
		for (int i = 0; i < 10; i++)
		{
			numbers[i] = (int)(Math.random() * 100 + 1);
		}
		
		for (int i: numbers)
		{
			System.out.println(i);
		}
		
		System.out.println("The average of the numbers is: " + average(numbers));
		
	}
	
	public static int average(int[] numbers)
	{
		int a= 0;
		for (int i: numbers)
		{
			a += i;
		}
		return a /= numbers.length;
	}
	
	
	
}