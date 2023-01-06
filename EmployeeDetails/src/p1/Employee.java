package p1;

class Employee {
	String Name,Desg;
	float Bsal;
	Employee(String Name,String Desg,float Bsal)
	{
		this.Name = Name;
		this.Desg = Desg;
		this.Bsal = Bsal;
	}
	void GetData()
	{
		System.out.println("Name: "+Name);
		System.out.println("Desg: "+Desg);
		System.out.println("TotalSal: "+(Bsal + 0.22f*Bsal
								+ 0.27f*Bsal));
	}
}
