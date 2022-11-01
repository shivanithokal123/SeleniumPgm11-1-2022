package opps_abstraction;

 public  class Mastercard extends ATM{
	 public void SBI()
	 {
		 System.out.println("SBI user");
	 }
	 public static void main(String args[]) {
		 Mastercard obj = new Mastercard ();
		 obj.HDFC();
		 obj.SBI();//abstract method
		 adhar();


	 }
	
}
