package forloop;
import java.util.*;
public class Primenum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		boolean prime = true;
		for(int i=low ;i<=high;i++)
		{
			prime = true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					prime = false;
					break;
				}
			}
			if(prime)
				System.out.println(i+" is prime");
		}
		sc.close();
	}

}
