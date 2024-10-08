package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class ComPoo {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os 3 lados de um triângulo X e Y para mostrarmos sua área e qual o maior:\nX: ");
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Area of triangle X: %.4f\n", areaX);
		System.out.printf("Area of triangle Y: %.4f\n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}
}
