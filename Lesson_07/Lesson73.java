public class Lesson73
{
	static String sentence = "alex ate many apples at a train station!";
	
	public static void main(String[]args)
	{
		bb();
		
		System.out.println(sentence);
	}
	public static void bb()
	{
		while (sentence.indexOf("a") >= 0)
		{
			sentence = sentence.substring(0,sentence.indexOf("a")) + "@" + sentence.substring(sentence.indexOf("a") + 1);
		}
	}
}