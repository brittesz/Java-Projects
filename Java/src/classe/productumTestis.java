package classe;

public class productumTestis {
public static void main(String[] args) {
	
	productum p1 = new productum("Macbook", 14777.13, 0.23);
	
	productum p2 = new productum();
	p2.nome = "Hyperpriced pen v2";
	p2.preco = 20.09;
	p2.desconto = 0.4;
										//o numero dentro dos () simboliza o valor atribuido pelo gerenteMaluco
	double TotalP1 = p1.preciumDescontabilis(0);
	double TotalP2 = p2.preciumDescontabilis(0.3);
	
	

	System.out.println(p1.nome);
	System.out.println(TotalP1);
	//System.out.println(p2.nome);
	//System.out.println(TotalP2);
	//double subtotal = TotalP1+TotalP2;
	//System.out.println("The total is " + subtotal);
	
	
	
}

}
