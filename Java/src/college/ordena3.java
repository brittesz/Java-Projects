package college;
import java.util.Scanner;

public class ordena3 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int a= input.nextInt();
	int b= input.nextInt();
	int c= input.nextInt();
	
	if(a<b && b<c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	else if (a<c && c<b) {
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
	}
	
	else if (b<a && a<c) {
		System.out.println(b);
		System.out.println(a);
		System.out.println(c);
	}
	
	else if (b<c && c<a) {
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
	}
	
	else if (b<c && c<a) {
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
	}
	
	else {
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
	}
	
}
}
