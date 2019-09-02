package a1;

import java.util.Scanner;
import java.util.HashMap;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numItems = scan.nextInt(); //Scanning in # items
		HashMap<String, Double> items = new HashMap<String, Double>(); //To store the item names + prices
		
		for(int i = 0; i < numItems; i++) { //Going thru item price list, storing in hashmap
			String tempItemName = scan.next();
			double tempItemPrice = scan.nextDouble();
			items.put(tempItemName , tempItemPrice);
		}
		
		int numPeople = scan.nextInt(); //Scanning in # customers
		
		//Initalizing variables to keep track of largest and smallest buys
		String biggestBuyer = "";
		Double biggestTotal = 0.0;
		
		String smallestBuyer = "";
		Double smallestTotal = 1000000000.0;
		
		Double cumulativeTotal = 0.0; //For later calculating avg.
		
		for (int i = 0; i < numPeople; i++) { //Going thru customers
			String tempFirstName = scan.next();
			String tempLastName = scan.next();
			String tempName = tempFirstName + " " +  tempLastName; //Joining first and last name as one str
			
			int itemsPurchased = scan.nextInt(); //# type items purchased by each individual
				
			double personalTotal = 0.0;  //Person's spend total
			
			for (int t = 0; t < itemsPurchased; t++) {//Going through type items bought by person
				int numberItemPurchased = scan.nextInt();
				personalTotal = personalTotal + (items.get(scan.next()) * numberItemPurchased ); //Calculating money spent by retrieving stored price		
			}
			//Conditionals to know whether to override current superlative 
			if (personalTotal > biggestTotal) {
				biggestBuyer = tempName;
				biggestTotal = personalTotal;
			}
			
			if (personalTotal < smallestTotal) {
				smallestBuyer = tempName;
				smallestTotal = personalTotal;
			}
			
			cumulativeTotal += cumulativeTotal ;	//Adding each persons final $ spent to group amount				
		}
		
		scan.close();
		//Printing results
		System.out.print("Biggest: " + biggestBuyer + " " + "(" + String.format("%.2f", biggestTotal) + ")" + "\n");
		System.out.print("Smallest: " + smallestBuyer + " " + "(" + String.format("%.2f", smallestTotal) + ")" + "\n");
		System.out.print("Average: " + String.format("%.2f", (cumulativeTotal / numPeople)));

	}
}
