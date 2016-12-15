import java.util.Scanner;

public class Lesson83
{
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a Word");
		String word = kb.next();
		
		int a = word.length();
		
		tree(word,0,a);
		
	}
	
	public static void tree(String word, int start, int stop)
	{
		System.out.printf("%10s\n", word.substring(0,start));
		if (start < stop)
		{
			tree(word, start + 1, stop);
		}
	}
	
}
