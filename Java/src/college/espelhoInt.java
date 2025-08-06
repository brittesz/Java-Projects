package college;
import java.util.Scanner;

public class espelhoInt {
	
	static void inverteFirst(int num, int v1[],int v2[]) {
		int i,j;
		int cont=0;
		for (i=num-1;i>=0;i--) {
			for(j=0; j<num;j++) {
				if(v1[i]==v2[j]) {
					cont++;
				}
			}
		}
		if (cont==num) {
			System.out.println("espelho");
		}
		else {
			System.out.println("nao espelho");
		}
		}
	
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int num = input.nextInt();
	int v1[]= new int [num];
	int i;
	//recebe 1
	for (i=0;i<num;i++) {
		v1[i]=input.nextInt();
	}
	//recebe dois
	int num2 = input.nextInt();
	int v2[]= new int [num];
	for (i=0;i<num2;i++) {
		v2[i]=input.nextInt();
	}
	
	inverteFirst(num,v1,v2);
	
}
}
