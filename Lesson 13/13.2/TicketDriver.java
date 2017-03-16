public class TicketDriver
{
	public static void main(String[]args)
	{
		Advance Ben = new Advance(11);
		StudentAdvance Sean = new StudentAdvance(9);
		Walkup noob = new Walkup();
		
		System.out.println("Receipt");
		System.out.println();
		System.out.println(Ben);
		System.out.println();
		System.out.println(Sean);
		System.out.println();
		System.out.println(noob);
	}
}