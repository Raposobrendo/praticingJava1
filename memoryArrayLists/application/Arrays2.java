package application;

import java.util.Locale;
import java.util.Scanner;

import entities3.Product;

public class Arrays2 {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantity;
		
		System.out.print("Input the quantity of products to register: ");
		quantity = sc.nextInt();
		Product[] vect = new Product[quantity];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Name of product #%d: ", (i+1));			
			String name = sc.nextLine();
			System.out.printf("Price of product #%d: ", (i+1));
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);			
		}
		
		double soma = 0;
		
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i].getPrice();
		}
		
		double avg = soma/vect.length;
		
		System.out.printf("Average price: %.2f", avg);
		
		
		sc.close();;
	}
}
