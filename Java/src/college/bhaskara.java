package college;
import java.util.Scanner;

public class bhaskara {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Insert A: ");
	double a = input.nextInt();
	System.out.println("Insert B: ");
	double b = input.nextInt();
	System.out.println("Insert C: ");
	double c = input.nextInt();
	
	double predelta = Math.pow(b, 2);
	double predelta2 = predelta - 4*a*c;
	double delta = Math.sqrt(predelta2);
	System.out.println(delta);
	double bhaskaraPos= (-b+delta)/2*a;
	double bhaskaraNeg= (-b-delta)/2*a; 
	
	System.out.printf("as raízes são: %.4f e %.4f",bhaskaraPos, bhaskaraNeg );
	
	input.close();
}
}
