package p1;
public class Marks {
	int Totalmarks,FCount;
	public Marks(int Tmarks,int Failc)
	{
		Totalmarks = Tmarks;
		FCount = Failc;
	}
	public void GetData()
	{
		System.out.println("PErcentage: "+(Totalmarks/6.0f));
		System.out.println("Sub Failed: "+FCount);
		if(FCount>0)
			System.out.println("FAil");
		else
			System.out.println("Pass");
	}
	
}
