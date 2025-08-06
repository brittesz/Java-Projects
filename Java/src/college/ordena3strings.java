package college;
import java.util.Scanner;

public class ordena3strings {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String a = input.next();
	String b = input.next();
	String c = input.next();
	
	if(a.compareTo(b)<0 && b.compareTo(c)<0) {
		System.out.print(a+ " " +b +" " +c );
	}
	
	else if (a.compareTo(c)<=0 && c.compareTo(b)<=0) {
		System.out.println(a+ " " +c +" " +b );
	}
	
	else if (b.compareTo(a)<=0 && a.compareTo(c)<=0) {
		System.out.println(b + " " +a +" " +c );
	}
	
	else if (b.compareTo(c)<=0 && c.compareTo(a)<=0) {
		System.out.println(b + " " +c +" " +a );
	}
	
	else if (c.compareTo(a)<=0 && a.compareTo(b)<=0) {
		System.out.println(c + " " +a +" " +b );
	}
	
	else {
		System.out.println(c + " " +b +" " +a );
	}

	
}
}
