package college;
import java.util.Scanner;

public class fibo {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
			
		int a = input.nextInt();
		int b = input.nextInt();

		while (b!=0) {
		  int resto = a % b;
	      a = b;
	      b = resto;
		}

System.out.println(a);

}
}
