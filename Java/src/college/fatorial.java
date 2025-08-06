package college;
import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        long fatorial = 1;
        
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        
        System.out.println(fatorial);
    }
}
