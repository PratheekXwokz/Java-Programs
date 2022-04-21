package com.xworkz.pratheek;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class april {
	
	public static void main(String[] args)throws IOException
	{
		
		String statement="Learning access specifiers";
		
		Path fileName = Path.of("C:\\Users\\sharath\\OneDrive\\Desktop\\statement.txt");
		
		Files.writeString(fileName,statement);
		
		String file_content=Files.readString(fileName);
		
		System.out.println(file_content);
		
	}

}