import java.util.Scanner;

public class Lesson62
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter your word.");
		String a= kb.next();
		System.out.println("");

		
		for (int i = a.length(); i > 0; i--)
		{
			System.out.println(a.substring(0,i));
		}			
	}
}