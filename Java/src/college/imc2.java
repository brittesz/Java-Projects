package college;
import java.util.Scanner;

public class imc2 {
	
	static void imcResposta(float peso, float altura) {
		double massa = (double)peso;
		double alturaC = (double)altura;
		double altu2 = Math.pow(altura, altura);
		double imc = peso/altu2;
		
		if (imc <16) {
			System.out.println("Magreza  grave");
		}
		
		else if ( imc <= 18.5 ) {
			System.out.println("Magreza moderada");
		}
		else if (imc <= 18.6 ) {
			System.out.println("Magreza leve");
		}
		else if (imc <= 25 ) {
			System.out.println("Saudavel");
		}
		else if (imc <= 30 ) {
			System.out.println("Sobrepeso");
		}
		else if (imc <= 35 ) {
			System.out.println("Obesidade Grau I");
		}
			else if (imc<43 ) {
				System.out.println("Obesidade Grau II (severa)");
		}
		else {
			System.out.println("Obesidade Grau III (morbida)");
		}
	}
	
	
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        float peso, altura;
        altura = input.nextFloat ();
        peso = input.nextFloat ();
        imcResposta (peso, altura);
        
    }
}
