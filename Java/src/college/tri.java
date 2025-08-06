package college;
import java.util.Scanner;

public class tri {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double a = input.nextDouble();
	double b = input.nextDouble();
	double sum = a+b;
	
	if (a == 90 || b==90) {
		System.out.println("retangulo");
	}
	
	else if (a <= 90 && b<=90) {
		System.out.println("acutangulo");
	}
	
	else {
		System.out.println("obtusangulo");
	}
	
	input.close();
}
}
