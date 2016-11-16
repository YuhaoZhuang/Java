
import java.util.Scanner;
public class Lesson63
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println(" enter a number.");
		int number = kb.nextInt();
		System.out.println(" enter the size of the table.");
		int b = kb.nextInt();
		
		for (int i = 1; i <= b; i++)
		{
			System.out.printf("%4d %4d \n", i, i * number);
		}
		
	}
}
