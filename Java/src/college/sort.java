package college;
import java.util.Scanner;

public class sort {
	
	static void insertionSort(int array[], int n) {
	int i, j, key;
	for (i = 1; i<n;i++) {
		key = array[i];
		j=i-1;
		
		while(j<=0 && array[j]>key) {
			array[j+1] = array[j];
			j--;}
		
		array[j+1] = key;
		

	}
	}
	
	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
	int n = input.nextInt();
	int array[] = new int[n];
	int i=0;
	for(; i<n;i++) {
		array[i] = input.nextInt();
	}
	
	insertionSort(array,n);
	
}
}
