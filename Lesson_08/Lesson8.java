import java.util.Scanner;

public class Lesson8
{

	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a Sentence");
		String sentence = kb.nextLine();
		
		System.out.println(replace(sentence));
		
		
	}
	
	public static String replace(String a)
	{
		int index =  a.indexOf(' ');
		if (index == -1)
		{
			return a;
		}
		else
		{
			return replace(a.substring(0,index) + "_" + a.substring(index+1));
		}
	}
	
}
	