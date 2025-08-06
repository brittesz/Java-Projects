package college;
import java.util.Scanner;

public class oi {
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
   
      int time = input.nextInt();
      
      int hora= time/3600;
      int sobrahora = time%3600;
      int min = sobrahora/60;
      int sobraseg = time%60;
      int seg = time%60;
   
      
      System.out.printf("%d: %d: %d", hora, min, seg);
  }
}