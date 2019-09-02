package a1;

import java.util.Scanner;
import java.util.List;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numItems = scan.nextInt();
		
		String[] items = new String[numItems];
		int[][] purchases = new int[2][numItems];
		
		for(int i = 0; i < numItems; i++) {
			items[i] = scan.next();
			double irrelevantP = scan.nextDouble();	
		}
		
		int numPeople = scan.nextInt();
		
		for(int i = 0; i < numPeople; i++) {
			String irrelevantFN = scan.next();
			String irrelevantLN = scan.next();
			
			int numPersonPurchases = scan.nextInt();
			
			for (int t = 0; t < numPersonPurchases ; t++) {
				int numPurchased = scan.nextInt();
				String itemPurchased = scan.next();
				//System.out.print(itemPurchased+"\n");
				//System.out.print(numPurchased+"\n");
				
				int indexMatch = java.util.Arrays.asList(items).indexOf(itemPurchased);
				//System.out.print(indexMatch +"\n");
				
				purchases [0][indexMatch] ++; 
				purchases [1][indexMatch] += numPurchased;	
			}	
		}
		scan.close();	
		
		for (int i = 0; i < numItems; i++) {
			if (purchases [0][i] > 0) {
				System.out.print(purchases [0][i] + " customers bought " + purchases [1][i] + " " + items[i] + "\n");
			}
			else {
				System.out.print("No customers bought " + items[i] + "\n");
			}
		}
	}
}
