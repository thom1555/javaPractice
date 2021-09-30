package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeting {
	
	public static String greet(String name) {
		switch (name) {
		case "Jane":
			return "Hey there Jane!";
		case "Mike":
			return "What's up Mike?";
		default:
			return ("Hello " + name + "!");
		}
	}
	
	public static void main(String[] args) throws IOException {
		// Create reader
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		
		// Prompt for name
		System.out.println("What is your name?");
		String name = reader.readLine();
		
		// Send greeting
		System.out.println(greet(name));
	}

}
