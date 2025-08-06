package college;
import java.util.Scanner;

public class maiorQueMedia {
	
	static void maiorque(int n, int v[], double media) {
		int i;
		int cont=0;
		for (i=0;i<n;i++) {
			if (v[i]>=n) {
				cont++;
			}
		}
		System.out.println(cont);
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int v[] = new int[n];
		int i;
		
		for (i=0; i<n; i++) {
			v[i] = input.nextInt();
		}
		double soma=0;
		for (i=0; i<n; i++) {
			soma +=v[i];
		}
		double media = soma/n;
		System.out.println(media);
		maiorque(n,v,media);
}}
