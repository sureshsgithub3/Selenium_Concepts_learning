package Java_TxtFile_Reading_And_Writing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class Wrting_ToText_File_appened {
	
	
	@Test
	public void writing() throws Exception{
		File file= new File("C:\\WorkSpaceFor_Luna\\Selenium_Concepts\\TextFile_Folder\\Write2.txt");
		FileWriter fw= new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("movie name: bahubali p2");
		bw.newLine();
		bw.write("year: 2017");
		bw.newLine();
		
		
		bw.close();
		System.out.println("file created");
		
		//this will append the text
		
	}

}
