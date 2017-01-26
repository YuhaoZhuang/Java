import java.util.Scanner;

public class Ex11_3
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[][]xando = new String [4][4];
		
		for(int i = 0; i < xando.length; i++)
		{
			for (int j = 0; j < xando[i].length; j++)
			{
				int pick = 1 + (int)(Math.random()*2);
				if (pick == 1)
				{
					xando[i][j] = "x";
				}
				if (pick == 2) 
				{
					xando[i][j] = "o";
				}
			}
		}
		for(int i = 0; i < xando.length; i++)
		{
			for (int j = 0; j < xando[i].length; j++)
			{
				System.out.print(xando[i][j] + "\t");
			}
			System.out.println();
		}
	}
}