import java.util.Scanner;

public class Lesson93
{

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("starting number: ");
		int start = kb.nextInt();
		
		System.out.println("sequence size: ");
		int size =  kb.nextInt();
		
		int[] a= new int[size];
		
		for (int i = 0; i < size; i++)
		{
			if (i == 0 || i == 1)
			{
				a[i] = start;
			}
			else
			{
				a[i] = a[i-1] + a[i-2];
			}
		}
		
		for (int i: a)
		{
			System.out.println(i);
		}
		
		
	}
}
	