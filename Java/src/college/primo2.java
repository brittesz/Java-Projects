package college;
import java.util.Scanner;

public class primo2 {
	
	static boolean isPrimo (int k) {
		int cont = 1;
		int i;
		
		for(i=2; i<=k; i++) {
			if(k%i==0) {
				cont++;
			}
		}
		
		if (cont==2) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int k = input.nextInt ();
        if (isPrimo (k)) {
            System.out.println ("PRIMO");
        }
        else {
            System.out.println ("COMPOSTO");
        }
    }
}
