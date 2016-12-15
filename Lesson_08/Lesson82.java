import java.util.Scanner;

public class Lesson82
{
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a = kb.nextInt();
		
		System.out.println("There are " + luck(a) + " sevens");
		
	}
	
	public static int luck(int n)
	{
		if (n > 0)
		{
			if (n%10 == 7)
			{
				return 1 + luck(n/10);
			}
			else
			{
				return 0 + luck(n/10);
			}
		}
		else
		{
			return 0;
		}
	}
	
}