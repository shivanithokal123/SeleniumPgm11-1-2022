package OwnPgm;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String args[])
	{
		
		
	
 Scanner t =new Scanner(System.in);
 System.out.println( "Enter name");
 	String a = t.nextLine();
 	
 	System.out.println( "hello "+a);
 	System.out.println("-----------------------");
 	 System.out.println( "Enter age");
 	int b=t.nextInt();
 
 	System.out.println( "Your age is  "+b);
 	
	}

	
}
