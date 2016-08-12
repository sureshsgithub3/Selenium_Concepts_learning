package FileHandling;

import java.io.File;

public class Create_TxtFile_5 {
	
	
	public static void main(String[] args){
		File fileobject= new File("C:/WorkSpaceFor_Luna/Selenium_Concepts/File_handling/Sele.txt");
		try{
		boolean filecreated=fileobject.createNewFile();
		
		if(filecreated==true){
			System.out.println("File is created");
		}else
			System.out.println("file not created");
		
		}catch(Exception e ){
			System.out.println(e);
		}
	}

}
