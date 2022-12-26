package p1;
import java.util.*;
public class InpOut {
	Employee e = null;
	Address ad = null;
	public InpOut()
	{
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name");
			String st = sc.nextLine();
			System.out.println("Enter Desg");
			String deg = sc.nextLine();
			System.out.println("Enter Bsal");
			float bsal = Float.parseFloat(sc.nextLine());
			System.out.println("Enter Hno");
			String Hno = sc.nextLine();
			System.out.println("Enter Stname");
			String Stname = sc.nextLine();
			System.out.println("Enter City");
			String City = sc.nextLine();
			System.out.println("Enter PinCode");
			int pin = Integer.parseInt(sc.nextLine());
			e = new Employee(st,deg, bsal);
			ad =new Address(Hno, Stname, City, pin);
		
	}
	public String toString()
	{
		return "HAi";
	}
	public void getData()
	{
		e.GetData();
		ad.getData();
	}
}
