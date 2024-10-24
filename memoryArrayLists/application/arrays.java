package application;

import java.util.Locale;
import java.util.Scanner;

public class arrays {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		medium();
		
	}
		
	public static void medium() {
		Locale.setDefault(Locale.US);
		Scanner sc1 = new Scanner(System.in);
		double medium, average = 0;
		int indiv;
				
		System.out.print("Input the number of individuals to make an average of heigth: ");
		indiv = sc1.nextInt();
		double[] vect = new double[indiv];
		
		for(int i = 0; i < indiv; i++) {
			System.out.printf("Input the heigth of individual #" + (i + 1) + "\n");
			double heigth = sc1.nextDouble();
			vect[i] = heigth;
		}
		for(int i = 0; i < indiv; i++) {
			average += vect[i];
		}
		
		medium = average/indiv;
		System.out.printf("Average heigth: %.2f", medium);
		
		sc1.close();
	}
}
