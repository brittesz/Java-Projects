package desafioModulo;

public class jantar {
	
	
	
public static void main(String[] args) {

	
	comida c1 = new comida("macarrao com frango",4.3);
	comida c2 = new comida("petit gateu",3.6);
	pessoa p1 = new pessoa("jenifer", 54.6);

	System.out.println(p1.apresentar());
	p1.comer(c1);
	System.out.println(p1.apresentar());
	p1.comer(c2);
	System.out.println(p1.apresentar());
	
}
}
