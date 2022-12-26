package p1;
public class Charlie {
	Charlie()
	{
		System.out.println("This is Constructor");
	}
	static
	{
		System.out.println("This is Static Block");
	}
	
	{
		System.out.println("This is Instance Block");
	}
	public static void main(String[] args) {
		System.out.println("This Is Local Statement");
		new Charlie();
	}
}
