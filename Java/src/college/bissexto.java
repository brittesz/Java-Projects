package college;

import java.util.Scanner;

public class bissexto {
public static void main(String[] args) {
	
    Scanner input = new Scanner(System.in);
    
    int ano = input.nextInt();
    int placeholder = ano%4;
   
    
    if (placeholder == 0 && placeholder!=0) {
    	System.out.println("ANO BISSEXTO");
    }
    
    else {
    	System.out.println("ANO NAO BISSEXTO");
    }
}
}
