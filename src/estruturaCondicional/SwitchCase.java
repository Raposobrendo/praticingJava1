package estruturaCondicional;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número e diremos que dia da semana é, de 1 a 7: ");
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "Saábado";
			break;
		default:
			dia = "Inválido";
		}
				
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}
}
