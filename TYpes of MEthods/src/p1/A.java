package p1;
import java.util.Scanner;
public class A {

	static int add(float num1,float num2)
	{
		return (int)(num1+num2);
	}
	void sub()
	{
		int a = 20,b =30;
		System.out.println("Diff:: "+(a-b));
	}
	static void mul()
	{
		int a =30,b=5;
		System.out.println("Mul: "+(a*b));
	}
	double div()
	{
		int a =40,b=3;
		return a/(float)b;
	}
	int rem(int a,int b)
	{
		return a%b;
	}
	public static void main(String[] args) {
		System.out.println("Add: "+add(2f,3f));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num::");
		int num = sc.nextInt();
		System.out.println("Num:: "+num);
		new A().sub();
		mul();
		System.out.println("DIv:: "+ new A().div());
		System.out.println("REm:: "+ new A().rem(156, 27));
		}}
