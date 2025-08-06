package college;
import java.util.Scanner;

public class charReverso {
	
	static void reverso(int n,  String v[]) {
	int i;
	for (i=n-1; i>=0;i--) {
		System.out.print(v[i]+ " ");
	}
	}
	
	
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	String v[] = new String[n];

	int i;
	for (i=0; i<n;i++) {
		v[i]=input.next();
	}
	
	reverso(n,v);
	
	
}
}
