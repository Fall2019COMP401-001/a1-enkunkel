package a1;

import java.util.Scanner;
import java.util.HashMap;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numItems = scan.nextInt(); 
		HashMap<String, Double> items = new HashMap<String, Double>(); //Hashmap to store names and prices of items
		
		//Going through items, adding to hashmap reference
		for(int i = 0; i < numItems; i++) { 
			String tempItemName = scan.next();
			double tempItemPrice = scan.nextDouble();
			items.put(tempItemName , tempItemPrice);
		}
		
		int numPeople = scan.nextInt();
		
		//Initializing variables to store superlative names and costs
		String biggestBuyer = "";
		Double biggestTotal = 0.0;
		
		String smallestBuyer = "";
		Double smallestTotal = 1000000000.0;
		
		Double cumulativeTotal = 0.0;
		
		//Going through people
		for (int i = 0; i < numPeople; i++) {
			//Scanning in first/last name, conjoining and saving them to temp var
			String tempFirstName = scan.next();
			String tempLastName = scan.next();
			String tempName = tempFirstName + " " +  tempLastName;
			
			int itemsPurchased = scan.nextInt();
				
			double personalTotal = 0.0; //Initializing personal total cost
			
			for (int t = 0; t < itemsPurchased; t++) {//Going thru items each person bought
				int numberItemPurchased = scan.nextInt();
				//Referencing hashmap for prices, adding item costs to persons total
				personalTotal = personalTotal + (items.get(scan.next()) * numberItemPurchased );			
			}
			//Conditionals determining if superlatives need to be replaced
			if (personalTotal > biggestTotal) {
				biggestBuyer = tempName;
				biggestTotal = personalTotal;
			}
			
			if (personalTotal < smallestTotal) {
				smallestBuyer = tempName;
				smallestTotal = personalTotal;
			}
			//Adding personal totals together 
			cumulativeTotal = cumulativeTotal + personalTotal;					
		}
		
		scan.close();
		//Printing results
		System.out.print("Biggest: " + biggestBuyer + " " + "(" + String.format("%.2f", biggestTotal) + ")" + "\n");
		System.out.print("Smallest: " + smallestBuyer + " " + "(" + String.format("%.2f", smallestTotal) + ")" + "\n");
		System.out.print("Average: " + String.format("%.2f", (cumulativeTotal / numPeople)));

	}
}
