package application;

import java.util.Locale;
import java.util.Scanner;

public class ForEach {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {"Juau", "Brenu", "Astrovaldo"};
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("------------------------------");
		for(String anyName : vect) {
			System.out.println(anyName);
		}
		
		
		sc.close();
	}
}
