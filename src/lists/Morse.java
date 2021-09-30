package lists;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Morse {

	private Hashtable<String, String> morseDict;
	private Hashtable<String, String> letterDict;


	public Morse() {
		morseDict = new Hashtable<String, String>();
		letterDict = new Hashtable<String, String>();
	}


	private void fillDefault() {
		morseDict.put("A", "*-");
		morseDict.put("B", "-***");
		morseDict.put("C", "-*-*");
		morseDict.put("D", "-**");
		morseDict.put("E", "*");
		morseDict.put("F", "**-*");
		morseDict.put("G", "--*");
		morseDict.put("H", "****");
		morseDict.put("I", "**");
		morseDict.put("J", "*---");
		morseDict.put("K", "-*-");
		morseDict.put("L", "*-**");
		morseDict.put("M", "--");
		morseDict.put("N", "-*");
		morseDict.put("O", "---");
		morseDict.put("P", "*--*");
		morseDict.put("Q", "--*-");
		morseDict.put("R", "*-*");
		morseDict.put("S", "***");
		morseDict.put("T", "-");
		morseDict.put("U", "**-");
		morseDict.put("V", "***-");
		morseDict.put("W", "*--");
		morseDict.put("X", "-**-");
		morseDict.put("Y", "-*--");
		morseDict.put("Z", "--**");
		morseDict.put(" ", "\n");

		letterDict.put("*-", "A");
		letterDict.put("-***", "B");
		letterDict.put("-*-*", "C");
		letterDict.put("-**", "D");
		letterDict.put("*", "E");
		letterDict.put("**-*", "F");
		letterDict.put("--*", "G");
		letterDict.put("****", "H");
		letterDict.put("**", "I");
		letterDict.put("*---", "J");
		letterDict.put("-*-", "K");
		letterDict.put("*-**", "L");
		letterDict.put("--", "M");
		letterDict.put("-*", "N");
		letterDict.put("---", "O");
		letterDict.put("*--*", "P");
		letterDict.put("--*-", "Q");
		letterDict.put("*-*", "R");
		letterDict.put("***", "S");
		letterDict.put("-", "T");
		letterDict.put("**-", "U");
		letterDict.put("***-", "V");
		letterDict.put("*--", "W");
		letterDict.put("-**-", "X");
		letterDict.put("-*--", "Y");
		letterDict.put("--**", "Z");
		letterDict.put(" ", " ");
	}


	private String toMorse(String input) {
		String answer = "";
		
		for (int i = 0; i < input.length(); i++){
		    char ch = input.charAt(i);
		    String s = morseDict.get(Character.toString(ch));
		    
		    answer = answer.concat(s);
			answer = answer.concat(" ");
		}

		
		return answer;
	}


	private String toEnglish(String input) {
		String answer = "";
		String[] letters = input.split(" ");

		for (String letter : letters) {
			answer = answer.concat(letterDict.get(letter));
		}

		return answer;
	}

	
	private String readFromEnglishFile() {
		String info = "";
		
		try {
			File myFile = new File("/Users/ianthompson/eclipse-workspace/ProgramExamples/src/lists/englishIn.txt");
			Scanner myReader = new Scanner(myFile);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				info = info.concat(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		return info.toUpperCase();
	}
	
	
	private String readFromMorseFile() {
		String info = "";
		
		try {
			File myFile = new File("/Users/ianthompson/eclipse-workspace/ProgramExamples/src/lists/morseIn.txt");
			Scanner myReader = new Scanner(myFile);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				info = info.concat(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		return info;
	}


	public static void main(String[] args) {

		Morse myMorse = new Morse();
		myMorse.fillDefault();
		//System.out.println(myMorse.toMorse("HELLO"));
		//System.out.println(myMorse.toEnglish("**** * *-** *-** ---"));
		
//		String input = myMorse.readFromEnglishFile();
//		System.out.println(myMorse.toMorse(input));
		
		String input1 = myMorse.readFromMorseFile();
		System.out.println(myMorse.toEnglish(input1));

	}
}
