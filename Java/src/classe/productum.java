package classe;
//CONSTRUTORES
public class productum {
	String nome;
	double preco;
	double desconto;
	
	//QUANDO VC CRIA UM CONTRUTOR NOVO VOCÊ PERDE O CONSTRUTOR DEFAULT, mas você pode voltar ao padrão de forma explícita descrita abaixo 
	
	productum(String nomeIni, double precoIni, double descontoIni){
		nome = nomeIni;
		preco = precoIni;
		desconto = descontoIni;
	}
	
	/*void*/ productum(){ //ao colocar o void ele se torna um metodo e nao mais um construtor, isso faz com q vc seja obrigado a colocar algo( "") dentro de productum p2 = new productum(""); na outra file
		
	}
	
		//gerenteMaluco se refere ao desconto dado pelo gerente caso ele queria 
	double preciumDescontabilis(double gerenteMaluco){
		return preco * (1- (desconto + gerenteMaluco));
	}
	
}
