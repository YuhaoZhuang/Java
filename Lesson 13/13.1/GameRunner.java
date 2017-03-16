public class GameRunner
{
	public static void main(String[]args)
	{
		PlayStation pl = new PlayStation("GOD Eaters");
		Xbox xb = new Xbox("Akiba's Strip");
		PC th = new PC("VR GirlFriend");
		
		System.out.println(pl.toString());
		System.out.println(xb.toString());
		System.out.println(th.toString());
	}
}