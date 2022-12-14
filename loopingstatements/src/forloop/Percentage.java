package forloop;
import java.util.*;
public class Percentage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks,sum=0;
		boolean status = true;
		for(int i=1;i<=6;i++)
		{
			System.out.println("Enter sub"+ i+" Marks:");
			marks = sc.nextInt();
			sum += marks;
			if(marks<40)
				status = false;
		}
		System.out.println("Per: "+(sum/6.0f));
		if(status)
			System.out.println("Pass");
		else
			System.err.println("Fail");
		sc.close();
	}

}
