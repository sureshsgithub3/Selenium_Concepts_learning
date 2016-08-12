package java_Io;

import java.util.Scanner;

public class Read_input {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Ener ur name");
		//passing input using scanner object 
         String name= scan.nextLine();
         
         
         System.out.println("Enter phone number");
		 long phonenumber=scan.nextLong();
		 
		 System.out.println("Enter ur rollno");
		 int rollno=scan.nextInt();
		
		 
		 System.out.println("Enter ur search criteria");
		 char s=scan.next().charAt(1);
		 
		 System.out.println("Enter a value");
		 boolean bval= scan.nextBoolean();
		 
		 /*System.out.println("Enter ur marks :");
		 double d=scan.nextDouble()*/;
		 
		 
		
		System.out.println("ur phone number :"+phonenumber);
		System.out.println("ur name is  :"+name);
		System.out.println("ur rollno is :"+rollno);
		System.out.println("Ur search criteria is :"+s);
		System.out.println("ur value is b:"+bval);

	}

}
