package classe;

public class atribuicoes {
public static void main(String[] args) {
	int a =2;
	int b=a; //atrbuição por valor - primitive type
	
	a++;
	b--;
	
	System.out.println("a:"+a+" b:"+b);
	
	data d1 = new data(1,4,1977);
	data d2 = d1;
	
	
	int y = 4;
	alterarPrimitivo(y);
	System.out.println(y);
	
}
	static void alterarPrimitivo(int y) {
		y++;
	}


}
