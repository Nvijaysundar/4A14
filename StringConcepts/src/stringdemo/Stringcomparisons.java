package stringdemo;
public class Stringcomparisons {
	public static void main(String[] args) {
		String st1 = "Java";
		String st2 = "Java";
		String st3 = new String("Java");
		String st4 = new String("Java");
		System.out.println(st1.equalsIgnoreCase(st2));
		System.out.println(st1.compareTo(st2));
		System.out.println(st1.compareToIgnoreCase(st2));
		if(st1==st2)
			System.out.println("String are equals");
		else
			System.out.println("String are not equals");
		if(st3==st4)
			System.out.println("String are equals");
		else
			System.out.println("String are not equals");
		st2 = "Language";
		System.out.println(st2);
	}

}
