import java.util.Scanner;

public class Lesson91
{

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		
		System.out.println("Enter a word");
		words[0] = kb.next();
		
		System.out.println("Enter a word");
		words[1] = kb.next();
		
		System.out.println("Enter a word");
		words[2] = kb.next();
		
		System.out.println("Enter a word");
		words[3] = kb.next();
		
		System.out.println("Entera word");
		words[4] = kb.next();
		
		bb(words);
		
	}
	
	public static void bb(String[] array)
	{
		for (String word : array)
		{
			System.out.println(word.charAt(0));
		}
	}
	
}
