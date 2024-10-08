package estruturaDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Functions {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, higher;
		
		System.out.println("Digite três números e mostraremos o maior: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		if(x > y && x > z) {
			return x;
		}
		else if (x > z) {
			return y;
		}
		else {
			return z;
		}
	}
	
	public static void showResult(int value) {
		System.out.println("Higher: " + value);
	}
}
