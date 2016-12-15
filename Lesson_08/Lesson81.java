import java.util.Scanner;

public class Lesson81
{
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String a = kb.next();
		
		System.out.println("Ener a word");
		String b = kb.next();
		
		System.out.println("Enter in a word");
		String c = kb.next();
		
		System.out.println(makeCenter(a));
		System.out.println(makeCenter(b));
		System.out.println(makeCenter(c));
		
		
	}
	
	public static String makeCenter(String a)
	{
		if (a.length() >= 20)
		{
			return a;
		}
		else
		{
			return makeCenter(" " + a + " ");
		}
	}
	
}