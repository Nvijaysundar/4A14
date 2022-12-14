package p1;
import java.util.*;
public class VC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().toUpperCase().charAt(0);
		if(ch>=48 && ch<=57)
		{
			System.out.println("Number");
		}
		else if((ch>=65 && ch<=90)|| (ch>=97 && ch<=122))
		{
			switch(ch)
			{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Vowel");
				break;
				default:
					System.out.println("Consonent");
			}
		}
		else
			System.out.println("Symbol");
		sc.close();	
	}

}
