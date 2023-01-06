package stringdemo;
public class Charlie {
	public static void main(String[] args) {
		String st = "Java PROGRAMMING";
		String st2 = new String("Language");
		System.out.println("Len: "+st.length());
		System.out.println("St: "+ st.toString());
		for(int i=0;i<st.length();i++)
			System.out.print(i+":"+st.charAt(i)+" ");
		System.out.println();
		System.out.println(st.startsWith("Jav"));
		String st3 = st.concat(st2);
		System.out.println(st3);
		st3 = st3.replaceAll("aR", "123");
		System.out.println(st3);
		System.out.println(st3.isEmpty());
		System.out.println(st3.isBlank());
		String st4 = "   ";
		System.out.println(st4.isBlank());
		System.out.println(st3.substring(6,12));
	}
}
