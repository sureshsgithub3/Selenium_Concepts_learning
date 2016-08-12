package Java_TxtFile_Reading_And_Writing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class Read_Write_To_File {
	
	
	@Test
	public void read_Write() throws Exception{
		File sfile= new File("C:\\WorkSpaceFor_Luna\\Selenium_Concepts\\TextFile_Folder\\Write1.txt");
		
		File dfile= new File("C:\\WorkSpaceFor_Luna\\Selenium_Concepts\\TextFile_Folder\\Write5.txt");
		
		FileReader fr= new FileReader(sfile);
		
		FileWriter fw= new FileWriter(dfile, true);
	    BufferedReader reader=new BufferedReader(fr);
	    BufferedWriter writer= new BufferedWriter(fw);
	    
	    
	    String line=null;
	    //this loop reads data from s file till the last
	    
	    while((line=reader.readLine())!=null){
	    	// writing to d file
	    	writer.write(line);
	    	writer.newLine();
	    	
	    }
	    writer.close();
	    
	    
	    
	    
	}

}
