package college;
import java.util.Scanner;

public class parimpar {
public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int size = input.nextInt();
    int lista[] = new int[size];
    int i=0;
    int par[] = new int[size];
    int impar[]= new int[size];
    
    for (i=0; i<size;i++) {
    	lista[i] = input.nextInt();
    }
    
    for (i=0; i<size; i++) {
    	if (lista[i]%2==0) {
    	   par[i] = lista[i];
    	}
    	else {
     	   impar[i] = lista[i];
    	}
    	System.out.println(par);
    	System.out.println(impar);
    }
    
    input.close();
    
}
}
