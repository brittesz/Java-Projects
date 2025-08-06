package college;
import java.util.*;
public class espacoEmLista {
	
	static void separaDigitos(String n) {
		int i;
		String word = "";
		for (i=0; i<n.length(); i++) {
			word+= n.charAt(i)+" ";
		}
		System.out.println(word);
	}
	
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		while (input.hasNext ()) {    // EOF
		String n = input.next ();
		separaDigitos(n);
		}
}
}
