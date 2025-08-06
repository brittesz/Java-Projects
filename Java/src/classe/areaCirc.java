package classe;

public class areaCirc {
	double raio;
	//pi é uma variavel, nesse caso, usamos static final
	static double PI = 3.141;
	
	//com o mesmo nome da classe
	public areaCirc(double raioInicial) {
		raio = raioInicial;
		
	}
	
	double area() {
		return Math.pow(raio, 2)*PI;
	}
	
}
