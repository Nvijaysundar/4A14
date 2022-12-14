package p1;
import java.util.*;
public class Direction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dir,sum=0;
		while(true)
		{
			dir = sc.nextInt();
			if(dir == -1||dir==1 )
				sum +=dir;
			else if(dir ==0)
				break;
			else
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		System.out.println("Sum: "+ sum);
		System.out.println("Rem: "+(sum%4));
		switch(sum%4)
		{
		case 0:
			System.out.println("East");
			break;
		case 1:
		case -3:
			System.out.println("North");
			break;
		case 2:
		case -2:
			System.out.println("West");
			break;
		case 3:
		case -1:
			System.out.println("South");
		}
		sc.close();
	}

}
