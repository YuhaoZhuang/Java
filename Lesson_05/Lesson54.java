import java.util.Scanner;
public class Lesson54
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("playing a as male or b female?");
		String speed = kb.next();
		
		if (speed.equals("a"))
		{
			System.out.println("Do u prefer a swordman or b knifeman?");
			String winConf = kb.next();
			if (winConf.equals("a"))
			{
				System.out.println("Do u like a big monster or b small monster?");
				String typefh = kb.next();
				if (typefh.equals("a"))
				{
					System.out.println("You enjoy the big monster"); 
				}
				else 
				{
					System.out.println("You enjoy small monster.");
				}
			}
			else 
			{
				System.out.println("Do u like to be a magician or b prince?");
				String typefm = kb.next();
				if (typefm.equals("a"))
				{
					System.out.println("You enjoy being a magician.");
				}
				else
				{
					System.out.println("You enjoy being princes.");
				}
			}
		}
		else 
		{
			System.out.println("Do u like being a princess or b witch ?");
			String winCons = kb.next();
			if (winCons.equals("a"))
			{
				System.out.println("Do u like being a tall or b short?");
				String typesg = kb.next();
				if (typesg.equals("a"))
				{
					System.out.println("You enjoy being tall.");
				}
				else 
				{
					System.out.println("You enjoy being short.");
				}
			}
			else 
			{
				System.out.println("Do u like being killed or kidnapped?");
				String typesl = kb.next();
				if (typesl.equals("a"))
				{
					System.out.println("You enjoy being killed.");
				}
				else 
				{
					System.out.println("You enjoy being kidnapped.");
				}
			}
		}
	}
}