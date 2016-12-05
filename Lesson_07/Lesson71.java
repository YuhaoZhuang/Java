public class Lesson71
{
	static int a = 1653;
	static int b = 0;
	static double c = 0;

	public static void main(String[]args)
	{
		avDigits();
		
		System.out.println("The average of the digits in " + a + " is " + c);
		
	}
	public static void avDigits()
	{
		int num = a;
		while (num > 0)
		{
			b += 1;
			c += num % 10;
			num /= 10;
		}
		
		c /= b;
	}
}