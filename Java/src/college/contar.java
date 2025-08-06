package college;
import java.util.Scanner;

public class contar {
	
	static void maiorQue(int n, int x,int v[]) {
		int i;
		int sum =0;
		for (i=0; i<n; i++) {
			if (v[i]>=x) {
				sum++;
			}
		}
		System.out.println(sum);
	}
	
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int n = input.nextInt();
	int v[] = new int[n];
	int i;
	
	for (i=0; i<n; i++) {
		v[i] = input.nextInt();
	}
	int x = input.nextInt();

	maiorQue(n,x,v);
	
	
	
	
	
}
}
