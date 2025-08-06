package college;
import java.util.Scanner;

public class frequencias {
	
	static void frequencia(int num, int ve[],int cont) {
		int i,j;
		for (i=0, j=num-1; i<j; i++,j--) {
			if( ve[i]== ve[j]){
				cont++;}
			
		
		
		
		}
			}

	
		
	
	
	
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	int ve[]=new int[num];
	int i;
	int cont=0;
	for (i=0;i<num;i++) {
		ve[i] = input.nextInt();
	}
	
	frequencia(num,ve,cont);
	
	
	
	
}
}
