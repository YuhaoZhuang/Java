public class Ex11_1
{
	public static void main(String[]args)
	{
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
	}
} 