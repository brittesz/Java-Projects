package classe;

import java.util.Scanner;

public class myPace {
public static void main(String[] args) {
	
	double total = 547;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter your actual pace, cutie :3");
	double pace = input.nextDouble();
	double myPace = (pace*100)/total;
	
	
	System.out.printf("My pace is actually: %.2f "+ "%", myPace );

	
	input.close();
}
}
