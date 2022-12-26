package stringdemo;
public class Charlie {
	public static void main(String[] args) {
		String st = "Java langugae";
		String st2 = new String("Java");
		System.out.println("Len: "+st.length());
		System.out.println("St: "+ st.toString());
		for(int i=0;i<st.length();i++)
			System.out.print(i+":"+st.charAt(i)+" ");
		System.out.println();
		System.out.println(st.startsWith("Jav"));
		String st3 = st.concat(st2);
		System.out.println(st3);
	}
}
