package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {
	public static void main(String[] Args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		System.out.println("------------------");
		
		for(String x : list) {
			System.out.println(x);
		}		
		System.out.println("------------------");
		
		list.remove(1); // remove element of index 1
		list.remove("Ana"); // remove element with String "Ana"		
		
		for(String x : list) {
			System.out.println(x);
		}		
		System.out.println("------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M'); // remove every element that starts with M
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		list.add("Brendo");
		list.add("Juau");
		list.add("Astrovaldo");
		list.add("Juzé");
		list.add("Ostênio");
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------");
		
		System.out.println("Index of Brendo: " + list.indexOf("Brendo")); // search index of element "Brendo" 
		System.out.println("Index of Julia: " + list.indexOf("Julia")); // what if search for element is no existent?
		System.out.println("------------------");
		
		//How to filter a only people that begins with char B?
		List<String> onlyB = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList()); 
		
		for(String x : onlyB) {
			System.out.println(x);
		}
		System.out.println("------------------");
		
		String first = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println("First element starting  with 'B': " + first);
		
		
		
	}
}
