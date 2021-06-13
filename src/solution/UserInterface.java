 package solution;

import java.io.IOException;
import java.util.Scanner;

public class UserInterface {
	
	public static void mainMenu() throws IOException {
		
		System.out.println(" Please select your option from the following:"); 
		System.out.println(" 1. List all the files"); 
		System.out.println(" 2. File operations (Add/Delete/Search)"); 
		System.out.println(" 3. Exit"); 
		
		Scanner sc = new Scanner(System.in);
		
		int inp = sc.nextInt();
		
	switch(inp) 
				{
		case 1: FileList.listFiles(); break;
    	case 2: fileoperationsmenu(); break;
		case 3: System.out.println("Program exited succesfully. Bye Bye!"+"see you later!"); break;
        default: System.out.println("The number you have entered is not valid."); mainMenu(); break;
		
		} 
		
	}
	
public static void fileoperationsmenu() throws IOException {
		
		System.out.println(" Please select your option from the following:"); 
		System.out.println(" 1. Add a file"); 
		System.out.println(" 2. Delete a file"); 
		System.out.println(" 3. Search a file"); 
		System.out.println(" 4. Go back to previous menu"); 
		
		
        Scanner sc = new Scanner(System.in);
		
		int inp = sc.nextInt();
		
		switch(inp) 
		{
     case 1: FileOperations.addFile(); fileoperationsmenu(); break;
     case 2: FileOperations.deleteFile(); fileoperationsmenu(); break;
     case 3: FileOperations.searchFile(); fileoperationsmenu(); break;
     case 4: mainMenu(); break; 
     default: System.out.println("Please enter a valid number."); fileoperationsmenu(); break;

}  
	
		
}
}
