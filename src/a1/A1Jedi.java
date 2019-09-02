package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int itemTotal = scan.nextInt();
		
		double[] values = new double[itemTotal];
		String[] items = new String[itemTotal];
		
		for(int i = 0; i < values.length; i++) {
			items[i] = scan.next();
			values[i] = scan.nextDouble();	
		}
		
		int customers = scan.nextInt();
		int[] counter = new int[itemTotal];
		int[] numbers = new int[itemTotal];
		
		
		for (int n = 0; n < customers; n++) {
			String name = scan.next() + scan.next();
			int numberOfItems = scan.nextInt();
			String[] foods = new String[numberOfItems];
			
			for (int y = 0; y < numberOfItems; y++) {
				int amount = scan.nextInt();
				foods[y] = scan.next();
				
				for (int i = 0; i < items.length; i++) {
					
					if(foods[y].equals(items[i])) {
						counter[i] += amount;
						if(numbers[i] < 2) {
							numbers[i] ++;
						}
					} 
				}
			}
			
		}	
		
		
		for (int n = 0; n < itemTotal; n++) {
			if(numbers[n] == 0) {
				System.out.println("No customers bought " + items[n]);
			} else {
				System.out.println(numbers[n] + " customers bought " + counter[n] + " " + items[n]);
			}
		}
	}
}

