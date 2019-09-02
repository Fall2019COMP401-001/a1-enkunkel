package a1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numItems = scan.nextInt();
		
		String[] items = new String[numItems]; //Array for storing item names
		int[][] purchases = new int[2][numItems]; //int array for storing buy instances and quantity.
		
		for(int i = 0; i < numItems; i++) {//Going through item name data
			items[i] = scan.next();
			double irrelevantP = scan.nextDouble();	//For skipping over unneeded data
		}
		
		int numPeople = scan.nextInt();
		
		for(int i = 0; i < numPeople; i++) { //Going through people purchases
			String irrelevantFN = scan.next();//For skipping over unneeded data
			String irrelevantLN = scan.next();//For skipping over unneeded data
			
			int numPersonPurchases = scan.nextInt();
			
			List<String> itemsPurchased = new ArrayList<String>();//Array list to prevent double counting of unique items
			
			for (int t = 0; t < numPersonPurchases ; t++) {//Going through individual item instances
				int numPurchased = scan.nextInt();
				String itemPurchased = scan.next();
				//Retrieving index of item in main array, so values can be deposited
				int indexMatch = java.util.Arrays.asList(items).indexOf(itemPurchased); 
				//Conditional preventing double counting of person item instance
				if (itemsPurchased.contains(itemPurchased)) {
					
				}
				else {
					itemsPurchased.add(itemPurchased);//Adding item to persons bought arraylist
					purchases [0][indexMatch] ++; //Adding to num of people bought array
				}
				purchases [1][indexMatch] += numPurchased;	//Adding to the total num things bought
			}	
		}
		scan.close();	
		
		for (int i = 0; i < numItems; i++) { //Going through list of items, printing out results conditionally
			if (purchases [0][i] > 0) {
				System.out.print(purchases [0][i] + " customers bought " + purchases [1][i] + " " + items[i] + "\n");
			}
			else {
				System.out.print("No customers bought " + items[i] + "\n");
			}
		}
	}
}
