package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class StaticMember {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double rad = sc.nextDouble();
		
		double c = Calculator.circunference(rad);
		
		double v = Calculator.volume(rad);
		
		System.out.printf("Circunference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f", Calculator.PI);
		
		
		sc.close();
	}
}
