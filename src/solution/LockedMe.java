package solution;

import java.io.IOException;
 
public class LockedMe {
	
	static String root = ".\\files\\";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String WelcomeMessage = "\n                    Welcome to LockedMe.com\n\n" 
		+ " This File Manager Application is developed by Yasir Thelakkad.";
		System.out.println(WelcomeMessage);  
		
		System.out.println(); 
		
		UserInterface.mainMenu();
		
	}

}
