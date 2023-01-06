package stringbufferclass;

public class Beta {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("Cap: "+sb.capacity());
		System.out.println("Len: "+sb.length());
		sb.append("Java");
		System.out.println("Cap: "+sb.capacity());
		System.out.println("Len: "+sb.length());
		sb.append("Programming language");
		System.out.println("Cap: "+sb.capacity());
		System.out.println("Len: "+sb.length());
		sb.insert(5,"HHHHH");
		System.out.println(sb);
	}
}
