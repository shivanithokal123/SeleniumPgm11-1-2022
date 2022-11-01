package myPackage;

public class string_Pgm {
	public static void main (String []args) {
		//string_Pgm a = new string_Pgm();
//		a.nonstatic();
//		a.nonstatic2();
		
		String s = "shruti";
		String s1="";
		for(int i= s.length()-1;i>=0;i--)
		{
			//int i =0 ; i<=s.length()-1; i++ :- if take this condition start from i=0 means 's' if i want reverse 
			//then have to start from last i=s.length if i took i>0 it wont print 's' for that i>=0 print all reverse string
			//System.out.print(s.charAt(i));//if want to print only reverse 
			//store original in variable then print original and reverse
			s1=s1+s.charAt(i);
			System.out.print(s.charAt(i));
			
		}
       System.out.println("original :  "  + s + "\n" + "Reverse  : " +s1);
	}
//		public void nonstatic() {
//			String s="This is the Non-Primtive String datatype and Concatination Example using non Static";
//			System.out.println(s);
//		}
//		public void nonstatic2() {
//			String s1 ="hi"+ "\n" + "how" + "\n" + "are";
//			System.out.println(s1);
//		}
	}
