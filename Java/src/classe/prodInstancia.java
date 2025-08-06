package classe;

public class prodInstancia {
	String name;
	double price;
	static double sale = 25;
	
	public prodInstancia(String nome, double preco, double promo) {
		name = nome;
		price = preco;
		sale = promo;
	}
	
	double madManagerSale() {
		return price - (price*(sale/100));
	}
	
}
