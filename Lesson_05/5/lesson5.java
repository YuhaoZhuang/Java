import java.util.Scanner;
public class lesson5    

{ 	
	static int a;
	static int b;
	

	public static void main (String[]args)
	{
		
		int a = (int)(Math.random()*7)+1;
		int b = (int)(Math.random()*7)+1;
		print();
	
	}
	
	public static void print()
	{
		if(a>b)
			System.out.println(a);
		if(b<a)
			System.out.println(b);
					
	}

}