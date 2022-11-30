package p2;
import p1.Student;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		String Name = sc.nextLine();
		long rollno = Long.parseLong(sc.nextLine());
		String Br = sc.nextLine();
		float per = sc.nextFloat();
		s.setData(Name, rollno, Br, per);
		s.getData();
		sc.close();
	}

}
