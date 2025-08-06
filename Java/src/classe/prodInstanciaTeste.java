package classe;

public class prodInstanciaTeste {
public static void main(String[] args) {
	
	prodInstancia purchase = new prodInstancia("Laptop",100,40);
	
	System.out.println("product:"+ purchase.name+ "  full price:" + purchase.price);
	System.out.println("Final price:"+ purchase.madManagerSale());
	
}
}
