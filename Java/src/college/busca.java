package college;
import java.util.Scanner;

public class busca {
	

static boolean buscaLista(int n, int v[], int find) {
    for (int i = 0; i < n; i++) {
        if (v[i] == find) {
            return true; 
        }
    }
    return false; }
	
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int find =0;
		int n = input.nextInt();
		int v[] = new int[n];
		int i;
		
		for (i=0; i<n; i++) {
			v[i] = input.nextInt();
		}
		for (i=0; i<n; i++) {
			v[i] = input.nextInt();
		}
		
		if (buscaLista(n,v,find)) {
			System.out.println("SIM");
		}
		else {
			System.out.println("CHAVE NAO ENCONTRADA");
		}
		
}}