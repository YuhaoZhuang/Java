import java.util.Scanner;

public class lesson31
{
	public static void main (String[]args)
	{
		Scanner k = new Scanner(System.in);
	

		
		System.out.println("what is your weight in punds?" );
	
		int a =k.nextInt();
		System.out.println("what is your height in inches?" );
		int b =k.nextInt();
		System.out.println("Your BMI is:" +a*703/b/b);
	
	}
	
}