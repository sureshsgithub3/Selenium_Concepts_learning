package FileHandling;

import java.io.File;
import java.io.IOException;

public class Create_Excel_File_6 {

	public static void main(String[] args) {
		File fileobject= new File("C:/WorkSpaceFor_Luna/Selenium_Concepts/File_handling/Selenium.xlsx");
		try {
		 boolean fe=	fileobject.createNewFile();
		 if(fe==true){
			 System.out.println("excel was created");
		 }else
			 System.out.println("excel is not created");
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
