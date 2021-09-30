package examples;

import java.util.Scanner;

public class Sum {
	
	/**
	 * @return An integer from the user
	 */
	public static int getInput() {
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		int num = -1;
		 
	    System.out.print("Enter your number: ");
	    while (num < 0) {
	    	if (flag) {
	    		System.out.print("Number must be positive! Try again: ");
	    	}
	    	
	    	while (!scanner.hasNextInt()) {
		        scanner.nextLine(); // clear the invalid input before prompting again
		        System.out.print("Please enter an integer: ");
		    }
	    	num = scanner.nextInt();
	    	scanner.nextLine();
	    	flag = true;
	    }
	     
	    scanner.close();
	    return num;
	}
	
	public static void main(String[] args) {
		int total = 0;
		int n = getInput();
		for (int i=0; i<=n; i++) {
			total += i;
		}
		System.out.println(total);
	}

}
