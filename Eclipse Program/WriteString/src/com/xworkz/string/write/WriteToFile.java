package com.xworkz.string.write;

import java.io.File;
import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class WriteToFile {
	public static void main(String[] args) {
		try {
			File newFile = new File("C:/Users/sharath/OneDrive/Desktop/Java Programs/Statement.txt");
			FileWriter myWriter = new FileWriter(newFile);
			myWriter.write("Files in Java might be tricky, but it is fun enough!");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
