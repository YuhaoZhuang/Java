import java.util.Scanner;

public class Lesson9
{

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		
		System.out.println("Enter a word");
		words[0] = kb.next();
		
		System.out.println("Enter a word");
		words[1] = kb.next();
		
		System.out.println("Eneter a word");
		words[2] = kb.next();
		
		System.out.println("Enter a word");
		words[3] = kb.next();
		
		System.out.println("Enter a word");
		words[4] = kb.next();
		
		System.out.println("In Order:");
		
		for (String word : words)
		{
			System.out.println(word);
		}
		
		System.out.println("Reversed:");
		
		reverse(words);
		
	}
	
	public static void reverse(String[] array)
	{
		for (int i = array.length - 1; i >= 0; i--)
		{
			System.out.println(array[i]);
		}
	}
	
}