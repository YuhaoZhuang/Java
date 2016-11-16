import java.util.Scanner;
public class Lesson41
{ 	
	static String i1;
	static String p1;
	static String i2;
	static String p2;
	static String i3;
	static String a;
	static String b;
	public static void main (String[]args)
	{
		//user inputs (fix numbers)
		Scanner k = new Scanner(System.in);
		
		System.out.println("Please enter your first name:" );
		i1 = k.nextLine();		
		System.out.println("please enter your last name" );
		p1 =k.nextLine(); 
		System.out.println("Please enter your title:" );
		i2 = k.nextLine();	
		System.out.println("Please enter your school site:" );
		a = k.nextLine();			
		System.out.println("please enter your school year:" );
		p2 =k.nextLine(); 
		System.out.println("What is your subject?" );
		b =k.nextLine(); 
		
		//print receipt
		System.out.println("**************************");
		
		print(a,p2);
		print(i1,p1);
		print(i2,b);

		System.out.println("****************************");
	}
	
	public static void print(String name, String price)
	{
		//formatting statement
		System.out.printf("* %15s\t\t%15s*\n", name, price);
	}
	
}