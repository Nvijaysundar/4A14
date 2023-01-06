package stringtokenizer;
import java.util.*;
public class Ross {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		StringTokenizer ob = new StringTokenizer(st,"' /@");
		
		while(ob.hasMoreTokens())
		{
			System.out.println(new StringBuffer(ob.nextToken()).reverse());
		}
	}

}
