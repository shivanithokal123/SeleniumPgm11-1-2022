package selenium_demo;

public class string {
	public static void main(String args[]) {
		String s1="";
		String s2=" ";
		String s3="Hey Shruti how are you";
		String s4="hey shruti how are you";
		String s5="HEY SHRUTI HOW ARE YOU";
		String s6="SHRUTI HOW ARE YOU";	
		String s7="SHRUTI HOW ARE YOU";	
		String s8="SHRUTI HOW ARE YOU";	
		String s9="Velocity";
		String s10="is the best class";
		
		//dosent take space
		System.out.println(s1.isEmpty());
		
		//it took space 
		System.out.println(s2.isBlank());
		
		
		//count space and character
		System.out.println(s3.length());
		
		System.out.println(s4.toUpperCase());
		
		System.out.println(s5.toLowerCase());
		
		
		//it return false if this text is not present 
		System.out.println(s6.startsWith("hey"));
		
		
		//end word present and it is case sensitive 
		System.out.println(s7.endsWith("YOU"));
		
		
		//at the end add the 
		System.out.println(s7.concat(" I am Fine "));
		
		System.out.println(s3.indexOf('a'));
		
		
		//character location no 
		System.out.println(s3.lastIndexOf("o"));
		
		
		//6th Location Character
		System.out.println(s3.charAt(13));
		
		
		//it write all word from 6 
		System.out.println(s3.substring(14));
		
		
		//start from 9 upto 13 if we take upto 14 it only print upt0
		//13 and store 1 include space 
		System.out.println(s3.substring(6, 14));	
		 
		//s4=s5;//bcoz s5 copy all the string in s4 then print true 
		System.out.println(s4.equals(s5));
		
		//Ignore uper and lower between two string and print it 
		System.out.println(s4.equalsIgnoreCase(s5));
		
		//replace string when we print s9 it take velocity name becoz we are not storing the replace string for that we have to craate on obj 
			
	String obj = s9.replace("Velocity", "heyyyyyy");
		 System.out.println(obj);
	}
}
