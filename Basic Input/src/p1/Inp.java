package p1;
import java.util.Scanner;
public class Inp {
	String Name,Code;
	int Qty;
	float Price;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Inp ob = new Inp();
	System.out.println("Enter Name: ");
	ob.Name = sc.nextLine();
	System.out.println("Enter Qty: ");
	ob.Qty = Integer.parseInt(sc.nextLine());
	System.out.println("Enter Price");
	ob.Price = Float.parseFloat(sc.nextLine());
	System.out.println("Enter Code: ");
	ob.Code = sc.nextLine();
	System.out.println("Code:: "+ ob.Code);
	System.out.println("Name:: "+ ob.Name);
	System.out.println("Qty:: "+ob.Qty);
	System.out.println("Price:: Rs."+ob.Price+"/-");
	}
}
