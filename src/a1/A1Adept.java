package a1;

import java.util.Scanner;

public class A1Adept {

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
		
		double[] money = new double[customers];
		String[] names = new String[customers];
		
		for (int n = 0; n < customers; n++) {
			String first = scan.next();
			String last = scan.next();
			int total = scan.nextInt();
			
			double temp = 0;
			
			for(int x = 0; x < total; x++) {
				int each = scan.nextInt();
				String product = scan.next();
				for(int y = 0; y < items.length; y++) {
					if(product.equals(items[y])) {
						temp += (values[y] * each);
					}
				}
			}
			
			money[n] = temp;
			names[n] = first + " " + last;				
		}
		
		
		
		int min = findValueMin(money);
		int max = findValueMax(money);
		String average = String.format("%.2f", average(money));
		
		String maxi = String.format("%.2f", money[max]);
		String mini = String.format("%.2f", money[min]);
		
		System.out.println("Biggest: " + names[max] + " (" + maxi + ")");
		System.out.println("Smallest: " + names[min] + " (" + mini + ")");
		System.out.println("Average: " + " " + average);
			
		scan.close();	
	}
		
	static int findValueMax (double[] vals) {
			
			// Initialize current minimum to first value in array.
			double cur_max = vals[0];
			int result = 0;
			
			// Starting with second value (if any), compare each value
			// in array with current minimum and replace if smaller.
			
			for (int i=1; i < vals.length; i++) {
				if (vals[i] > cur_max) {
					cur_max = vals[i];
					result = i;
				}
			}
			
			return result;
	}
	
	static int findValueMin (double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_min = vals[0];
		int result = 0;
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
				result = i;
			}
		}
		
		return result;
	}
	
	static double average (double[] vals) {
		
		// Initialize current minimum to first value in array.
		double start = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			start += vals[i];
		}
		
		double result = start / (vals.length);
		
		return result;
	}

}

