package college;
public class separaPalavra {

    public static void main(String[] args) {
        String palavra = "exemplo";
        String separador = " "; // Pode ser qualquer caractere separador

        // Usando um array
        String[] letrasArray = palavra.split("");
        String resultadoArray = String.join(separador, letrasArray);
        System.out.println("Separado por array: " + resultadoArray);

    }
}