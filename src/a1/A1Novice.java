package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int people = keyboard.nextInt();  //Getting # of customers
		
		//Initializing arrays for storing customer names and total data
		String[] names = new String[people];
		double [] totals = new double[people];
	
		
		for (int p = 0; p < people; p++) { //Loop for going through customers
			//Reading in first and last names, joining them together, and saving them in name array
			String first_name = keyboard.next();
			String last_name = keyboard.next();
			names[p] = first_name.substring(0,1) + ". " + last_name; 
			
			int num_items = keyboard.nextInt(); //Getting number of different things bought
			
			for (int i = 0; i < num_items; i++) { //Going through different items bought
				double num_single_items = keyboard.nextDouble();
				String irrelevant = keyboard.next(); //Irrelevant; needed to skip over unneeded info
				double price = keyboard.nextDouble();
				
				
				totals[p] = totals[p] + (num_single_items * price); //Updating shopping total with each type of item
				
				
			}
			System.out.print(names[p] + ": " + String.format("%.2f", totals[p])+"\n"); //Printing formatted data
		}
		keyboard.close();
		
		
	}
}
