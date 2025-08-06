package college;
import java.util.Scanner;

public class digito {
	static void separaDigitos(int num) {
		int i, mil,cem,dez,uni;
		mil = num/1000; i=num%1000;
		cem = i/100; i=i%100;
		dez = i/10; i=i%10;
		uni = i; 
	
		System.out.printf("%d %d %d %d",mil,cem,dez,uni);
	}
	
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num = teclado.nextInt ();
        while (num > 0) {
            separaDigitos (num);
            num = teclado.nextInt ();
        }
    }
}
