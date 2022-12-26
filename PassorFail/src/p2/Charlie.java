package p2;
import java.util.*;
import p1.*;
public class Charlie {
	static
	{
		try(Scanner sc = new Scanner(System.in);)
		{
			System.out.println("Enter Name");
			String N = sc.nextLine();
			System.out.println("Enter Roll");
			long Rol = sc.nextLong();
			int sub,sum=0,fcount =0;
			for(int i=1;i<=6;i++)
			{
				System.out.println("Enter Sub"+i+" Marks: ");
				sub = sc.nextInt();
				sum += sub;
				if(sub<40)
				{
					fcount++;
				}
			}
			Student st = new Student(N,Rol);
			Marks m = new Marks(sum,fcount);
			st.getData();
			m.GetData();
			st = null;
			m = null;	
		}
	}
	public static void main(String[] args) {
		
	}
}
