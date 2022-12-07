package p1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int wt;
	System.out.println("ENter Age");
	int age = sc.nextInt();
	if(age>=18 && age<=55)
	{
		System.out.println("Enter Height: ");
		if(sc.nextFloat()>4.7f)
		{
			System.out.println("Enter Weight: ");
			wt = sc.nextInt();
			if(wt>=50 && wt<=120)
			{
				if(wt>=80)
					System.out.println("Add Extra Ropes");
				System.out.println("Eligible");
			}
			else
				System.out.println("Not Eligible. Reason: Weight Limit");
		}
		else
			System.out.println("Not Eligible. Reason: Height Limit");
	}
	else if(age>=13 && age<=17)
	{
		System.out.println("Enter Height: ");
		if(sc.nextFloat()>4.2f)
		{
			System.out.println("Enter Weight: ");
			wt = sc.nextInt();
			if(wt>=37 && wt<=80)
			{
				System.out.println("Eligible");
			}
			else
				System.out.println("Not Eligible. Reason: Weight Limit");
		}
		else
			System.out.println("Not Eligible. Reason: Height Limit");
	}
	else
		System.out.println("Not Eligible. Reason: age limit");
	sc.close();
	}

}
