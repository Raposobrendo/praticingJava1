package estruturaDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class doWhile {
	public static void main (String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double F, C;
		char rep;
	
		do {
			System.out.print("Digite uma temperatura em Celsius, e ser convertido para Fahrenheit: ");			
			C = sc.nextDouble();
			F = 9*C/5 + 32;		
			System.out.printf("%.1f F\n", F);
			System.out.println("Deseja repetir operação?");
			rep = sc.next().charAt(0);
		}while(rep != 'n');
		
		System.out.println("Programa finalizado.");
		
		sc.close();
	}
}
