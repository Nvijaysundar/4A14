package stringdemo;
import java.util.*;
public class VowelsCon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st  = new String(sc.nextLine().toLowerCase().trim());
		int vc = 0,cc = 0,dc = 0,syc = 0,sum = 0;
		for(int i=0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch>=97&&ch<=122)
			{
				switch(ch)
				{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vc++;
				default:
					cc++;
				}
			}
			else if(ch>=48 && ch<=57)
			{
				dc++;
				sum += Integer.parseInt(String.valueOf(ch));
			}
			else
				syc++;
		}
	}

}
