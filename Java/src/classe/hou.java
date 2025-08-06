package classe;

import java.util.Scanner;

public class hou {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Denero necessitado para HOU。 （没火） 你好！");
		
		int preco = input.nextInt();
		int total = 0;
		
		while(preco>=0) {
		System.out.println("多少钱?");
		preco = input.nextInt();
		total += preco;
		
		System.out.println("R$ "+total+ " es el total, mi marquesa");
		}
		
		input.close();
	}}





