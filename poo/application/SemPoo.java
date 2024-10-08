package application;

import java.util.Locale;
import java.util.Scanner;

public class SemPoo {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xa, xb, xc, ya, yb, yc, x, y, p;
		
		System.out.println("Digite os 3 lados de um triângulo X e Y para mostrarmos sua área e qual o maior:\nX: ");
		
		xa = sc.nextDouble();
		xb = sc.nextDouble(); 
		xc = sc.nextDouble();

		System.out.println("Y: ");
		
		ya = sc.nextDouble();
		yb = sc.nextDouble(); 
		yc = sc.nextDouble();
		
		p = (xa + xb + xc)/2;
		x = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));
		p = (ya + yb + yc)/2;
		y = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));
		
		System.out.printf("Area of triangle X: %.4f\n", x);
		System.out.printf("Area of triangle Y: %.4f\n", y);
		
		if (x > y) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}
}
