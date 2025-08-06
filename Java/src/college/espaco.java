package college;
import java.util.*;

public class espaco {
	
	static void separaDigitos(String n) {
		int i;
		String letra = "";
		for (i=0; i<n.length();i++) {
			letra += n.charAt(i)+ " ";
		}
		System.out.println(letra);
	}
	
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        while (input.hasNext ()) {    // EOF
            String n = input.next ();
            separaDigitos (n);
        }
    }
}
