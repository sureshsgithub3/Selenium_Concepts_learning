package Java_TxtFile_Reading_And_Writing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class Writing_To_Txt_file {
	
	
	@Test
	public void Writing() throws Exception{
		File f= new File("C:\\WorkSpaceFor_Luna\\Selenium_Concepts\\TextFile_Folder\\Write1.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter writer= new BufferedWriter(fw);
		 
		writer.write("name: chandra");
		writer.newLine();
		writer.write("age:27");
		writer.newLine();
		writer.write("City :hyd");
		
		writer.close();
		System.out.println("Write1 file created");
		// if we re excute this code it will overwrite the file
	}

}
