package college;
import java.util.Scanner;

public class sorenum {
public static void main(String[] args) {
	
Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	
	int mil = number/1000;
	int sobramil = number%1000;
	
	int cent = sobramil/100;
	int sobracent = number%100;
	
	int dez = sobracent/10;
	int uni = number%10;
			
	System.out.printf("%d%d%d%d",uni, dez, cent, mil);
	
	input.close();
}
}
