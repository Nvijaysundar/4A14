package stringdemo;
import java.util.*;
public class TexttoNum {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
		System.out.println("ENter Text:");
		System.out.println(sc.nextLine().toUpperCase().trim()
				.replaceAll("[ABC]","2").replaceAll("[DEF]","3")
				.replaceAll("[GHI]","4").replaceAll("[JKL]","5")
				.replaceAll("[MNO]","6").replaceAll("[PQRS]","7")
				.replaceAll("[TUV]","8").replaceAll("[WXYZ]","9"));
		}
	}

}
