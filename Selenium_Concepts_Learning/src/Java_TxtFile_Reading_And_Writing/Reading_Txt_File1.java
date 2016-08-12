package Java_TxtFile_Reading_And_Writing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class Reading_Txt_File1 {
	
	
	@Test
	public void reading() throws IOException{
		File f= new File("C:\\WorkSpaceFor_Luna\\Selenium_Concepts\\TextFile_Folder\\Read1.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		
		String line=null;
		
		while((line=br.readLine())!=null){
			System.out.println(line);
			
			
		}
		
		
	}

}
