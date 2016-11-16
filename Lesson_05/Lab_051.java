import java.util.Scanner;
public class Lab_051  
{ 	
	static String a;
	static String b;
	static String c;
	static String d;
	static String e;
	static String f;
	static String g;
	public static void main (String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter math grade:" );
		a = k.next(); 
		System.out.println("Please enter math grade:" );
		b = k.next(); 
		System.out.println("Please enter math grade:" );
		c = k.next(); 
		System.out.println("Please enter math grade:" );
		d = k.next(); 
		System.out.println("Please enter math grade:" );
		e = k.next(); 
		
		System.out.println("Please enter math grade:" );
		f = k.next(); 
		System.out.println("Please enter math grade:" );
		g = k.next(); 
		double bb = (cc(a)+ cc(b) + cc(c) + cc(d)+cc(e)+cc(f)+cc(g))/7;
		System.out.println("Your paheic GPA is: "  +bb );
		
	}
	
	public static double cc(String grade)
	{
		if( grade.equals("A") )
			return 4.0;
		if( grade.equals("B") )
			return 3.0;
		if( grade.equals("C") )
			return 2.0;
		if( grade.equals("D") )
			return 1.0;
		else
			return 0.0;	
	}
}
