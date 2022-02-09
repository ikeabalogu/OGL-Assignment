package com.ogstest.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

 public class UserInput {		 
	
	
	public void getUserinput() {
		try (BufferedReader brf = new BufferedReader(new InputStreamReader(System.in))) {

			//get user input from terminal
			System.out.println
			("Please enter a File Address to read in the form of C:\\testfile.txt");

			String str = brf.readLine();
			System.out.println("String entered: " + str);
			
			//Validate input and assign to option object in case it is empty
			Optional<String> file = validate(str);
			
			 //If file is not null and has content print that required stats
			if (file.isPresent() && file.get().length()>0) {
				//print stats to screen
				printStatsofInput(new WordStats(file.get()));
			}else {
				System.out.println
				("The file location hass no text");
			}
		}catch(IOException e) {
			 System.out.println("Invalid file location. Restart program to try again"); 
		 }
		
	}


	public Optional<String> validate(String input) throws IOException {
		
		 return Optional.ofNullable(Files.readString(Paths.get(input, "")));
	}

	private void printStatsofInput(WordStats wordStats) {
		
			System.out.println("The Word Count is: " + wordStats.getWordCount());
			System.out.println("The Average Word Length is: " + wordStats.getAverageWordLength());
			System.out.println("The Shortest Word is: " + wordStats.getShortestWord());
			System.out.println("The Longest Word is: " + wordStats.getLongestWord());

	}
		
	
}
