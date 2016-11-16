import java.util.Scanner;

public class Lesson61
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a numberr.");
		int a = kb.nextInt();
		int b = 1;
		
		for (int i = 1; i <= a; i++)
		{
			b *=i;
		}
		System.out.println(a + "! " + "is " + b);
	}
}