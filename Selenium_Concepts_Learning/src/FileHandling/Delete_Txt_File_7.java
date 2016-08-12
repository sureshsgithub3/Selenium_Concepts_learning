package FileHandling;

import java.io.File;

public class Delete_Txt_File_7 {

	public static void main(String[] args) {
		File fileobject= new File("C:/WorkSpaceFor_Luna/Selenium_Concepts/File_handling/Sele.txt");
	     boolean fe=fileobject.delete();
	     if(fe==true){
	    	 System.out.println("File was deleted");
	    	 
	    	 
	     }else
	    	 System.out.println("File not was not there to delete");
	

	}

}
