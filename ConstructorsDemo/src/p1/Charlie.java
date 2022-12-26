package p1;
public class Charlie {
	Charlie(int x)
	{
		System.out.println("This is Constructor, x: "+x);
	}
	void m1()
	{
		System.out.println("This is m1 Method");
	}
	void m2()
	{
		System.out.println("This is m2 method");
	}
	public static void main(String[] args) {
		Charlie ob = new Charlie(100);
		ob.m1();
		ob.m2();
	}
}
