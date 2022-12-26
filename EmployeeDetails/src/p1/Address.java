package p1;

public class Address {
	String Hno,Stname,City;
	int pincode;
	Address(String Hno,String Stname,String City,
						int pincode)
	{
		this.Hno = Hno;
		this.Stname = Stname;
		this.City = City;
		this.pincode = pincode;
	}
	void getData()
	{
		System.out.println("Hno: "+Hno);
		System.out.println("Stname: "+Stname);
		System.out.println("City: "+City);
		System.out.println("Pincode: "+pincode);
	}
}
