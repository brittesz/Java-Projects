package college;
import java.util.Scanner;
public class fibonacci2 {

	static void fibonacci (int num) {
		int firstNumber = 0;
		int secondNumber = 1;
		int sum = 0;
		int i;
			for (i = 2; i < num; i++) {
	
				sum = firstNumber + secondNumber;
	
				firstNumber = secondNumber;
				secondNumber = sum;
			}
		
			if(num ==2){
			    System.out.print('1');
			}
			else{
			System.out.print(sum + " ");
			}
	}
	
	
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int num = input.nextInt ();
        fibonacci (num);
        
    }}