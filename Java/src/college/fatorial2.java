package college;
import java.util.Scanner;

public class fatorial2 {
	
	static void fatorial(long num) {
		long fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        
        System.out.println(fatorial);
	}
	
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num = teclado.nextInt ();
        fatorial (num);

    }
}
