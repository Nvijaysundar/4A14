package p1;
import java.util.StringJoiner;
public class Product {
	String Name,COde;
	int qty;
	float price;
	public Product(String Name,String Code,int qty,float price)
	{
		this.Name =Name;
		this.COde = Code;
		this.qty = qty;
		this.price = price;
	}
	public void getData()
	{
		StringJoiner ob  = new StringJoiner("\t");
		ob.add(Name).add(COde).add(String.valueOf(qty))
							.add(String.valueOf(price));
		System.out.println(ob.toString());
	}
}




