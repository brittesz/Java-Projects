package college;
import java.util.Scanner;
public class jokenpo {
	
	  static String resultado(String s1, String s2) {
	      if (s1.compareTo(s2)==0) {
	        return "empate";
	      }
	      else {
	        if (s1.compareTo("pedra")==0) {
	          if (s2.compareTo("papel")==0) { return "jogador 2"; }
	          else { return "jogador 1"; }
	        }
	        else if (s1.compareTo("papel")==0) {
	          if (s2.compareTo("pedra")==0) { return "jogador 1"; }
	          else { return "jogador 2"; }
	        }
	        else {
	          if (s2.compareTo("pedra")==0) { return "jogador 2"; }
	          else { return "jogador 1"; }
	        }
	      }
	    }
	      
	
	    public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        int n = teclado.nextInt();
	        int i;
	        for (i = 0; i < n; i++) {
	          String s1 = teclado.next();
	          String s2 = teclado.next();
	          System.out.println(resultado(s1,s2));
	        }
	    }
	  }