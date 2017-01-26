import java.util.Scanner;

public class Ex11_4
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		int[][]values = new int [4][4];
		
		for(int i = 0; i < values.length; i++)
		{
			for (int j = 0; j < values[i].length; j++)
			{
				values[i][j] = 1 + (int)(Math.random() * 100);
			}
		}
		for(int i = 0; i < values.length; i++)
		{
			for (int j = 0; j < values[i].length; j++)
			{
				System.out.print(values[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Please enter a number:");
		int divisor = kb.nextInt();
		
		int count = 0;
		
		for (int i = 0; i < values.length; i++)
		{
			for (int j = 0; j < values[i].length; j++)
			{
				if (values[i][j] % divisor == 0)
				{
					count++;
				}
			}
		}
		
		System.out.println("There are " + count + " numbers divisible by " + divisor + " in this array.");
	}
}