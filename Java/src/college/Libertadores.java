package college;
import java.util.Scanner;

class Libertadores {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numJogadas = input.nextInt();
    int i;
    for (i = 0; i < numJogadas; i++) {
      int j1 = input.nextInt(); // time 1
      input.next();
      int j2 = input.nextInt(); // time 2

      int j3 = input.nextInt(); // time 2
      input.next();
      int j4 = input.nextInt(); // time 1

      // 1. saldo de gols
      int vencedor = (j1 + j4) - (j2 + j3); // 0 = empate, 1 = time 1, -1 = time 2
      if (vencedor == 0) {
        // 2. mais gols marcados na casa do adversario
        vencedor = j4 - j2;
      }
      if (vencedor == 0) {
        System.out.println("Penaltis");
      } else if (vencedor > 0) {
        System.out.println("Time 1");
      } else {
        System.out.println("Time 2");
      }
    }
  }
}

