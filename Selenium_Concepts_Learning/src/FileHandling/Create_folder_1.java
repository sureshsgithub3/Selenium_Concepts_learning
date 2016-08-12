package FileHandling;

import java.io.File;

import org.testng.annotations.Test;

public class Create_folder_1 {
	@Test
	public void createfolder(){
		File fileobject= new File("C:/WorkSpaceFor_Luna/Selenium_Concepts/File_handling");
		fileobject.mkdir();
		
		//this will create folder creation
	}

}
