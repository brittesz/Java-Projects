package college;
import java.util.Scanner;

public class hotdawg {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double hotdog = input.nextDouble();
	double pessoas = input.nextDouble();
	
	double media = hotdog/pessoas;
	
	System.out.printf("%.2f",media);
}
}
