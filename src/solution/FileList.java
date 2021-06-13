package solution;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileList {
	
	public static void listFiles() throws IOException {
		
		File myfile = new File(".\\files\\");
		File[] f1 = myfile.listFiles();
		List<File> filesList = Arrays.asList(f1);
		List<String> filesListNames = new ArrayList<>();
		
		Collections.sort(filesList);
		
		System.out.println("\nAvailable files are listed below:\n");
		
		if(f1!=null && f1.length>0) {
			for(File file :filesList) {
				filesListNames.add(file.getName());
			}
			
			filesListNames.stream().forEach(System.out::println);
		} else { System.out.println("\n List is empty");
		}
	}

}
