public class Lesson72
{
	static int c = 123456709;
	static int a = 0;
	
	public static void main (String[]args)
	{
		getReverse();
		
		System.out.println(c + " reversed is " + a);
	}
	public static void getReverse()
	{
		int num = c;
		
		while (num > 0)
		{
			a *= 10;
			a += num % 10;
			num /= 10;
		}
	}
	
}