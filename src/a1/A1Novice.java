package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int people = keyboard.nextInt();
		String[] names = new String[people];
		double [] totals = new double[people];
		//System.out.print(people);// CHECKED
		
		for (int p = 0; p < people; p++) {
			
			String first_name = keyboard.next();
			String last_name = keyboard.next();
			names[p] = first_name.substring(0,1) + ". " + last_name;
			//System.out.print(names[p]); //CHECKED
			
			int num_items = keyboard.nextInt();
			//System.out.print(num_items); //CHECKED
			
			for (int i = 0; i < num_items; i++) {
				double num_single_items = keyboard.nextDouble();
				String irrelevant = keyboard.next(); //Irrelevant
				double price = keyboard.nextDouble();
				
				
				totals[p] = totals[p] + (num_single_items * price);
				
				
			}
			System.out.print(names[p] + ": " + String.format("%.2f", totals[p])+"\n");
		}
		keyboard.close();
		
		
	}
}
