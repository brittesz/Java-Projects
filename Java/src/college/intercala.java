package college;
import java.util.Scanner;

public class intercala {

    static void intercalador(int ListaUm[], int ListaDois[], int v1, int v2) {
        int i = 0;
        int j = 0;

        while (i < v1 && j < v2) {
            if (ListaUm[i] <= ListaDois[j]) {
                System.out.print(ListaUm[i] + " ");
                i++;
            } else {
                System.out.print(ListaDois[j] + " ");
                j++;
            }
        }

        while (i < v1) {
            System.out.print(ListaUm[i] + " ");
            i++;
        }

        while (j < v2) {
            System.out.print(ListaDois[j] + " ");
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int v1 = input.nextInt();
        int v2 = input.nextInt();

        int ListaUm[] = new int[v1];
        int ListaDois[] = new int[v2];
        int i;

        for (i = 0; i < v1; i++) {
            ListaUm[i] = input.nextInt();
        }

        for (i = 0; i < v2; i++) {
            ListaDois[i] = input.nextInt();
        }

        intercalador(ListaUm, ListaDois, v1, v2);

        input.close();
    }
}