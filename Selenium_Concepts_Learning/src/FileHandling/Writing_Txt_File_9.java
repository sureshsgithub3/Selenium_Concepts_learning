package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writing_Txt_File_9 {

	public static void main(String[] args) throws Exception {
		FileWriter fw= new FileWriter("C:\\WorkSpaceFor_Luna\\Selenium_Concepts\\TextFile_Folder\\write4.txt");
		BufferedWriter writer= new BufferedWriter(fw);
		
		writer.write("chandra");
		writer.newLine();
		writer.write("suresh");
		writer.newLine();
		writer.close();

	}

}
