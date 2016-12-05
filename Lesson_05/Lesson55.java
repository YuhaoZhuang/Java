import java.util.Scanner;

public class Lesson55

{
	static String a;
	static String c;
	static String b;
	static String d;
	

	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Let's setup your  account!");
		System.out.println("Please enter username.");
		a = kb.next();
		System.out.println("Please enter password.");
		c = kb.next();
		
		System.out.println("account has been created!");
		System.out.println("login.");
		System.out.println("Please enter your username.");
		b = kb.next();
		System.out.println("Please enter your password.");
		d = kb.next();
		
		passCheck();
	}
	
	public static void passCheck()
	{
		if (a.equals(b) && c.equals(d))
		{
			System.out.println("  access granted!");
		}
		else if (!a.equals(b) && c.equals(d))
		{
			System.out.println(" username is incorrect!");
		}
		else if (a.equals(b) && !c.equals(d))
		{
			System.out.println(" password is incorrect!");	
		} 
		else
		{
			System.out.println("Your username and password are incorrect!");
		}
	}
}