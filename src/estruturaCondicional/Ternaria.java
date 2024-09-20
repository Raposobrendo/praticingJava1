package estruturaCondicional;

import java.util.Scanner;

public class Ternaria {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		double preco;
		System.out.println("Digite o valor de um produto e mostraremos o preço com desconto: ");
		
		preco = sc.nextDouble();
		preco = (preco > 50) ? preco*0.9 : preco;
		
		System.out.println("Valor do produto: R$ " + preco);
		sc.close();
	}
}
