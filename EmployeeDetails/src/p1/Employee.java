package p1;

public class Employee {
	String Name,Desg;
	float Bsal;
	public void SetData(String Name,String Desg,float Bsal)
	{
		this.Name = Name;
		this.Desg = Desg;
		this.Bsal = Bsal;
	}
	public void GetData()
	{
		System.out.println("Name: "+Name);
		System.out.println("Desg: "+Desg);
		System.out.println("TotalSal: "+(Bsal + 0.22f*Bsal
								+ 0.27f*Bsal));
	}
}
