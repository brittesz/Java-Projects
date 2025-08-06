package college;
import java.util.Scanner;

public class palindromo {
	static boolean isPalindromo(String s) {
		int i, j;
		for (i=0, j=s.length()-1; i<j; i++,j--) {
			if( s.charAt(i)!= s.charAt(j)){
				return false;
			}
		}
		return true;
	}
	
	
	//main
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	while(input.hasNext()) {
		String  s = input.next();
		if(isPalindromo(s)==true) {
			System.out.println("sim");
		}
		else {
			System.out.println("nao");
		}
	}
	
}
}

