import java.util.Scanner;
public class lesson5    

{ 	
	static int a;
	static int b;
	

	public static void main (String[]args)
	{
		
		a = (int)(Math.random()*7)+1;
		b = (int)(Math.random()*7)+1;
		System.out.println("You rolled" +a);
		System.out.println("Compuer rolled"+ b);
		print();
	
	}
	
	public static void print()
	{
		if(a > b)
			System.out.println("The winner is you!");
		if(b > a)
			System.out.println("The winner is he compuer");
					
	}

}