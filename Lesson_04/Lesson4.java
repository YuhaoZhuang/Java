import java.util.Scanner;
public class Lesson4

{ 	static String i1;
	static int p1;
	static String i2;
	static int p2;
	static String i3;
	static int p3;
	static String i4;
	static int p4;


	public static void main (String[]args)
	{
		//user inputs (fix numbers)
		Scanner k = new Scanner(System.in);
		
		System.out.println("Please enter item 1:" );
		i1 = k.nextLine();		
		System.out.println("please enter price for 1" );
		p1 =k.nextInt(); //leaves an extra return char left over
		k.nextLine();//eats the extra return char
		
		System.out.println("Please enter item 2:" );
		i2 = k.nextLine();		
		System.out.println("please enter price for 2" );
		p2 =k.nextInt(); //leaves an extra return char left over
		k.nextLine();//eats the extra return char
		
		System.out.println("Please enter item 3:" );
		i3 = k.nextLine();		
		System.out.println("please enter price for 3" );
		p3 =k.nextInt(); //leaves an extra return char left over
		k.nextLine();//eats the extra return char
		
		System.out.println("Please enter item 4:" );
		i4 = k.nextLine();		
		System.out.println("please enter price for 4" );
		p4 =k.nextInt(); //leaves an extra return char left over
		
		//print receipt
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		
		print(i1, p1);
		print(i2, p2);
		print(i3, p3);
		print(i4, p4);
		
		//printsubtotal, tax, and total using print()
		print("Subtotal: ", p1 + p2 + p3 + p4);
		print ("Tax:", (( p1 + p2 + p3 + p4)*0.8));
		print("Total:",((p1+p2+p3+p4)*1.08));
		System.out.println("____________________________________________");
		System.out.println("*Thank You for your support*");
	}
	
	public static void print(String name, double price)
	{
		//formatting statement
		System.out.printf("* %15s..........%15.2f\n", name, price);
	}
	
}

