package classe;

import java.util.Scanner;

public class angulo {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double a = input.nextDouble();
	double b = input.nextDouble();
	
	double quad = Math.pow(b, 2);
	double forpi = 3.14*(1.333);
	double volume = forpi*a*quad;
	
	
	
	System.out.printf("A: %s B: %s",a,b);
	System.out.println();
	System.out.printf("volume: %s",volume);
}
}
