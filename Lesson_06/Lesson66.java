import java.util.Scanner;

public class Lesson66
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your word.");
		String a = kb.next();
		System.out.println("");
	
		
		for (int i = a.length(); i >= 0; i--)
		{
			System.out.println(a.substring(i));
		}
	}
}	