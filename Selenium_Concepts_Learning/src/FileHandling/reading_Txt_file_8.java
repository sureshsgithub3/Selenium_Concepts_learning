package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class reading_Txt_file_8 {

	public static void main(String[] args) throws Exception {
		File f= new File("C:\\WorkSpaceFor_Luna\\Selenium_Concepts\\TextFile_Folder\\Read1.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		
		String line;
		
		while((line=br.readLine())!=null){
			System.out.println(line);
			
			
		}
		
     br.close();
	}

}
