package college;
import java.util.Scanner;

public class celudas {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int cedulas = input.nextInt();
	
	int cem = cedulas/100;
	int sobra = cedulas%100;
	int cinquy = sobra/50;
	sobra = sobra%50;
	int vinte = sobra/20;
	sobra = sobra%20;
	int dez = sobra/10;
	sobra =sobra%10;
	int cinco = sobra/5;
	sobra =sobra%5;
	int dois = sobra/2;
	sobra =sobra%2;
	int um = sobra/1;
	
	System.out.println("R$"+cedulas+".00");
	System.out.println(cem+" nota(s) de R$100.00 ");
	System.out.println(cinquy+" nota(s) de R$50.00");
	System.out.println(vinte+" nota(s) de R$20.00 ");
	System.out.println(dez+ " nota(s) de R$10.00");
	System.out.println(cinco+" nota(s) de R$5.00 ");
	System.out.println(dois+ " nota(s) de R$2.00");
	System.out.println(um+ " nota(s) de R$1.00");


}
}
