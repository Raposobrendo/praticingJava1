package estruturaCondicional;

import java.util.Scanner;

public class Ifelse {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		int hora = sc.nextInt();
		
		if(hora < 0 || hora > 24) {
			System.out.println("Ta em ontem ou amanhã amigo?");
		}
		else if(hora < 12){
			System.out.println("Bom dia!");
		}
		else if(hora >= 12 && hora < 18){
			System.out.println("Boa tarde.");
		}
		else{
			System.out.println("Boa noite.");
		}		
	}
}
