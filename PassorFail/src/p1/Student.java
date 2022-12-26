package p1;

public class Student {
	String Name;
	long Roll;
	
	public Student(String sname, long rollno)
	{
		Name = sname;
		Roll = rollno;
	}
	public void getData()
	{
		System.out.println("NAme: "+Name);
		System.out.println("RollNo: "+Roll);
	}
}
