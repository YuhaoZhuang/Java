import java.util.Scanner;

public class Lesson64
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("What number do you want to count by?");
		int a = kb.nextInt();
		System.out.println("What number do you want to count to?");
		int b = kb.nextInt();
		
		for (int i = a; i <= b; i += a)
		{
			System.out.printf(i + " ");
		}
	}
}