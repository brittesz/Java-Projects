package college;
import java.util.Scanner;

public class energia {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double kw = input.nextDouble();
	double reais = input.nextDouble();
	double flag = input.nextDouble();
	
	double calc;
	
	
	if (flag==1) {
		calc = kw*reais;
		System.out.printf("%.2f",calc);
	}
	
	else if (flag ==2) {
		calc = kw*reais+(kw*0.015);
		System.out.printf("%.2f",calc);
	}
	
	else if (flag ==3) {
		calc = kw*reais+(kw*0.03);
		System.out.printf("%.2f",calc);
	}
	
	else if (flag ==4) {
		calc = kw*reais+(kw*0.045);
		System.out.printf("%.2f",calc);
	}
	
	
	input.close();
}
}
