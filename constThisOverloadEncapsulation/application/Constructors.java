package application;

import java.util.Locale;
import java.util.Scanner;

import entities2.Product;

public class Constructors {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");		
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
							
		Product product = new Product(name, price);
		
		System.out.println("Product data: " + product);
		
		System.out.println("Enter the number of products to be added in stock: ");
		
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data: " + product);
		
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}
