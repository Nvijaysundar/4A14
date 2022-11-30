package p1;
public class Student {
	String Name,Branch;
	long rollno;
	float per;
	public void setData(String sName,long sroll,String Br,float sper)
	{
		Name = sName;
		rollno = sroll;
		Branch = Br;
		per = sper;
	}
	public void getData()
	{
		System.out.println("Name: "+ Name);
		System.out.println("Rollno: "+rollno);
		System.out.println("Branch: "+Branch);
		if(per>=40)
		{
			System.out.println("Percentage: "+per);
		}
		else
		{
			System.err.println("Percentage: "+per);
		}
	}
}
