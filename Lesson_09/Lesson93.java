import java.util.Scanner;

public class Lesson93

{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter starting number.");
		int a = kb.nextInt();
		System.out.println("Enter sequence size.");
		int b = kb.nextInt();
		
		int[] sequence = new int[b];
		
		for(int i = 0; i < b; i++)
		{
			if(i == 0 || i == 1)
			{
				sequence [i] = a;
			}
			else
			{
				sequence[i] = sequence[i-1] + sequence[i-2];
			}
			System.out.print(sequence[i] + " "); 
		}
	}
}