public class Lesson67

{
	public static void main(String[]args)
	{
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey", 3);
		sing("Goodbye!", 1);
	}
	public static void sing(String word, int times)
	{
		for(int i = 1; i < times + 1; i++ )
		{
			System.out.printf(word + " ");
		}
		System.out.println();
	}
}