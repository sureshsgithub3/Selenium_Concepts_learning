package FileHandling;

import java.io.File;

import org.testng.annotations.Test;

public class Folder_Exists_or_not_2 {
	
	@Test
	public void folderexistsornot(){
		File fileobject= new File("C:/WorkSpaceFor_Luna/Selenium_Concepts/File_handling");
		//checks folder exists or not
	    boolean  fe=	fileobject.exists();
	    
	    if(fe==true){
	    	System.out.println(true);
	                }else
	    	    	 System.out.println(false);
	}

}
