package college;
import java.util.Scanner;

public class vetorReversoListaInt {
public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int listaSize = input.nextInt();
    int lista[] = new int[listaSize];
    int i;
    for (i=0; i<listaSize;i++) {
    	lista[i] = input.nextInt();
    }
    for (i=listaSize-1; i>=0; i--) {
    	System.out.println(lista[i]);
    }
    
    
}
}
