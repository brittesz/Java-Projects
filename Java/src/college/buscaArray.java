package college;
import java.util.Scanner;

public class buscaArray {
	
	static boolean buscaString(String vet[], String resto) {
		int j,i=0;
		for(;i<vet.length;i++) {
			if (vet[i].equals(resto)) {
				return true;
			}
		}
		return false;
	}
	
public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
	int n = input.nextInt();
	int i=0;
	String resto ="";
	String vet[] = new String[n];
	
	for(; i<n;i++) {
		vet[i]=input.next();}
	
	while(input.hasNext()) {
		resto = input.next();
		
		if (buscaString(vet,resto)==true) {
			System.out.println("sim");
		}
		else {System.out.println("nao");}
	}
	
	
}
}
