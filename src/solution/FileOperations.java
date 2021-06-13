  package solution;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
	public static void addFile() throws IOException{
		
		System.out.println("Enter a file to be created");
	    Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		File file = new File(".\\files\\", fileName);
		
		if(file.createNewFile())
			System.out.println("File is created.\n");
		else
			
		    System.out.println("File is not created.\n");
		  
	}
	
	
public static void deleteFile() throws IOException{
		
		System.out.println("Enter a file to be deleted");
	    Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		File file = new File(".\\files\\", fileName);
		
		if(file.delete())
			System.out.println("File deleted.\n");
		else
			
		    System.out.println("File is not deleted.\n");
	
		
			
	}

public static void searchFile() throws IOException{
	
	System.out.println("Enter a file to search");
    Scanner sc = new Scanner(System.in);
	String fileName = sc.nextLine();
	File file = new File(".\\files\\", fileName);
	
	if(file.exists())
		System.out.println("File exists.\n");
	else
		
	    System.out.println("File does not exists.\n");
		
 		
}

}
