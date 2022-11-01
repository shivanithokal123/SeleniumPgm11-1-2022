package myPackage;

public class MyClass {
	

	
	public static void demoStatsic() {
		System.out.println("Calculation Method");//static method Example
	}
	
	
	public void nonStatic1() {
		System.out.println(2+3);//Non-static method
	}
	
	public void nonStatic2() {
		System.out.println(2-5);//Non-static method
	}
	
	
	public void nonStatic3() {
		System.out.println(2*3);//Non-static method
	}
	
	
	public static void main(String arg[]) {

		System.out.println(2%3);// Main method Example
		
		
		
		MyClass  a1 = new MyClass();
		a1.nonStatic3();			
			a1.nonStatic2();
			MyClass.demoStatsic();
			a1.nonStatic1();		
	}
	
	
}
