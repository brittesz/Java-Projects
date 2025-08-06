package college;
import java.util.Scanner;

public class mds2 {
	
	static void mmc(int a, int b) {
		
		int x = a;
		int y = b;
		
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        int mdc = a;
        int mmc2 = Math.abs(x * y) / mdc;

        System.out.println(mmc2);
	  }
	
	
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int a = teclado.nextInt ();
        int b = teclado.nextInt ();
         mmc (a, b);
    }
}
