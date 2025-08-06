package college;
import java.util.Scanner;

public class amuleto {

  static void comeletra(String s) {
    int i, j;
    for (j = 0; j < s.length(); j++) {
      for (i = 0; i < j; i++) {
        System.out.print(" ");
      }
      for (i = 0; i < s.length() - j; i++) {
        System.out.print(s.charAt(i) + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while (input.hasNext()) { // EOF
      String n = input.next();
      comeletra( n );
    }
  }
}