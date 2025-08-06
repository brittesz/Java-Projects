package college;
import java.util.*;
public class bissexto2 {
	
	//class
	static boolean isBissexto (int ano) {
		int si = ano%4;
		int bai = ano%100;
		int sibai = ano%400;
		
		 if (bai==0 && sibai!=0){
			return false;
		}
		
		if (si==0 || sibai ==0) {
			return true;
		}

		else {
			return false;
		}
		
	}
	
	
	
	
	//main
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int ano = teclado.nextInt ();
        if (isBissexto (ano)) {
            System.out.println ("ANO BISSEXTO");
        }
        else {
            System.out.println ("ANO NAO BISSEXTO");
        }
    }
}
