package college;
import java.util.Scanner;

public class perfeito2 {
	
	static boolean isPerfeito(int num) {

		int soma = 1;
		int i;
		
		for(i=2; i<num;i++) {
			if(num%i==0) {
				soma +=i;
			}
		}
		
		if (soma==num) {
			return true;
		}
		else {
			return false;
		}
		
	
	}
	

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int num = input.nextInt ();
        if (isPerfeito (num)) {
            System.out.println ("SIM");
        }
        else {
            System.out.println ("NAO");
        }
        }}

