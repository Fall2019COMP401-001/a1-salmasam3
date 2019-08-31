package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int customers = scan.nextInt();
		
		for (int i = customers; i >= 0; i--) {
			char first_name = scan.next().charAt(0);
			
			String last_name = scan.next();
			
			int total = scan.nextInt();
			
			double temp = 0;
			
			for (int y = 0; y < total; y ++) {
				int amount = scan.nextInt();
				
				String item = scan.next();
				
				double price = scan.nextDouble();
				
				temp += (amount * price); 
			}
			String result = String.format("%.2f", temp);
			
			System.out.println(first_name + ". " + last_name + ": " + result);
			
		}
		
		scan.close();
		
	}
}
