import java.util.Scanner;
public class lab_05    

{ 	
	static double a;
	static double b;
	static double c;
	static double d;
	static double e;
	static double f;
	static double g;
	static double h;
	public static void main (String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter your l:" );
		a = k.nextDouble();	
		System.out.println("Please enter your w:" );
		b = k.nextDouble();
		System.out.println("Please enter your l:" );
		c = k.nextDouble();	
		System.out.println("Please enter your w:" );
		d = k.nextDouble();;
		e = (a+b+c+d);
		f = (a+b+c+d)*0.08;
		g = e+f;
		
		print();
		er();
	}
	
	public static void print()
	{
		if( g >= 2000 )
			h = g*0.85;	
		if (g <= 2000)
			h = g;
	}
	public static void er()
	{
		System.out.println("-------------------------------------------");
		System.out.printf("*  Subtoal ------%.2f *\n",e);
		System.out.printf("*   Tax------%.2f *\n",f);
		System.out.printf("*   Total------%.2f *\n",h);
		System.out.println("-------------------------------------------");
	}
}
