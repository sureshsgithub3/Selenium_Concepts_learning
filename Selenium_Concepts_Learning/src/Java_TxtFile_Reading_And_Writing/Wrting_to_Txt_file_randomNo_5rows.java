package Java_TxtFile_Reading_And_Writing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class Wrting_to_Txt_file_randomNo_5rows {
	
	
	
	@Test
	public void writetotxt() throws Exception{
		File file= new File("C:\\WorkSpaceFor_Luna\\Selenium_Concepts\\TextFile_Folder\\Write3.txt");
		FileWriter fw= new FileWriter(file,true);
		BufferedWriter writer= new BufferedWriter(fw);
		
		for(int i=0;i<=5;i++){
			for(int j=0;j<=5;j++){
			int num=(int)(Math.random()*100);
			writer.write(num);
			}
			writer.newLine();
			
		}
		writer.close();
		System.out.println("File was created");
		
		
	}

}
