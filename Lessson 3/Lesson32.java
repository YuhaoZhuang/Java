import java.util.Scanner;

public class Lesson32
{
	public static void main (String[]args)
	{
		Scanner k = new Scanner(System.in);
	

		
		System.out.println("what is your bbuilding width?" );
	
		int a =k.nextInt();
		System.out.println("what is your building height?" );
		int b =k.nextInt();
			System.out.println("what is your buildinglength?" );
		int c=k.nextInt();
		System.out.println("Your voulume is:" +a*b*c);
	
	}
	
}