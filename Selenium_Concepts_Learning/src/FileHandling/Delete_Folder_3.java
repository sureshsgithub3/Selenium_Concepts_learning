package FileHandling;

import java.io.File;

public class Delete_Folder_3 {

	public static void main(String[] args) {
		//this is to delete folder
		File fileobject= new File("C:/WorkSpaceFor_Luna/Selenium_Concepts/ABC");
		
		//it returns boolean value based on delete 
	 boolean  fe=	fileobject.delete();
	 if(fe==true){
		 System.out.println(true);
	 }else
		 System.out.println(false);

	}

}
