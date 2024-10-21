package application;

import java.util.Locale;
import java.util.Scanner;

import entities2.Product3;

public class Auto {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		
		Product3 product = new Product3(name, price, quantity);
		
		System.out.println("Product data: " + product);
		
		System.out.print("Enter the number of products to be added in stock: ");
		
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data: " + product);
		
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data: " + product);
		
		
		sc.close();
	}
}
