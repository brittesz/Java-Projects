package college;
import java.util.Scanner;

public class piso {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int height = input.nextInt();
	int length = input.nextInt();
	
	int middles =2*(height+length-2);
	int fulls = (height*length) + ((length-1)*(height-1));
	
	System.out.println(fulls);	
	System.out.println(middles);
	
	input.close();
}
}
