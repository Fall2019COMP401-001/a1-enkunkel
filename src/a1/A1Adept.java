package a1;

import java.util.Scanner;
import java.util.HashMap;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numItems = scan.nextInt(); 
		HashMap<String, Double> items = new HashMap<String, Double>();
		
		for(int i = 0; i < numItems; i++) {
			String tempItemName = scan.next();
			double tempItemPrice = scan.nextDouble();
			items.put(tempItemName , tempItemPrice);
		}
		
		int numPeople = scan.nextInt();
		
		
		String biggestBuyer = "";
		Double biggestTotal = 0.0;
		
		String smallestBuyer = " ";
		Double smallestTotal = 1000000000.0;
		
		Double cumulativeTotal = 0.0;
		
		for (int i = 0; i < numPeople; i++) {
			String tempFirstName = scan.next();
			String tempLastName = scan.next();
			String tempName = tempFirstName + " " +  tempLastName;
			
			int itemsPurchased = scan.nextInt();
				
			double personalTotal = 0.0;
			
			for (int t = 0; t < itemsPurchased; t++) {
				int numberItemPurchased = scan.nextInt();
				personalTotal = personalTotal + (items.get(scan.next()) * numberItemPurchased );			
			}
			
			if (personalTotal > biggestTotal) {
				biggestBuyer = tempName;
				biggestTotal = personalTotal;
			}
			
			if (personalTotal < smallestTotal) {
				smallestBuyer = tempName;
				smallestTotal = personalTotal;
			}
			
			cumulativeTotal = cumulativeTotal + personalTotal;					
		}
		
		scan.close();
		
		System.out.print("Biggest: " + biggestBuyer + " " + "(" + String.format("%.2f", biggestTotal) + ")" + "\n");
		System.out.print("Smallest: " + smallestBuyer + " " + "(" + String.format("%.2f", smallestTotal) + ")" + "\n");
		System.out.print("Average: " + String.format("%.2f", (cumulativeTotal / numPeople)));

	}
}
