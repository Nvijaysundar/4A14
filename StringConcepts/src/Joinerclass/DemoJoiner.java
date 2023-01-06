package Joinerclass;
import java.util.*;
public class DemoJoiner {
	public static void main(String[] args) {
		StringJoiner sb = new StringJoiner("-");
		sb.add("Hi");
		sb.add("Hello");
		System.out.println(sb.toString());
		System.out.println(sb.length());
		StringJoiner sj2 = new StringJoiner("/");
		sj2.add("02").add("01").add("2023");
		System.out.println(sj2);
		sb.merge(sj2);
		System.out.println(sb);
		StringJoiner sj3 = new StringJoiner("@");
		sj3.setEmptyValue("Joiner is Empty");
		//sj3.add("h");
		System.out.println(sj3);
	}

}







