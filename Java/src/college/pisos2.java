package college;
import java.util.Scanner;

public class pisos2 {
	static void pisos (int length, int height) {
		
		int middles =2* (height+length-2);
		int fulls = (height*length) + ((length-1)*(height-1));
		
		System.out.println(fulls);	
		System.out.println(middles);
		
		
	}
	
	   public static void main (String[] args) {
	        Scanner input = new Scanner (System.in);
	        int length = input.nextInt ();
	        int height = input.nextInt ();
	        pisos (length, height);
	    }
}
