package Inheritance;

public class hierarchical2 extends hierarchical {
	public void Axis() {
		System.out.println("welcome to axis bank");
	}
	public static void main(String args[])
	{
		hierarchical2 obj=new hierarchical2();
		obj.Axis();
		obj.ID();
		obj.Password();
		
		System.out.println("*************************************************************");
		hierarchical1 obj1=new hierarchical1();
		obj1.HDFC();
		obj1.ID();
		obj1.Password();
		System.out.println("*************************************************************");
		hierarchical obj2=new hierarchical();
		obj2.ID();
		obj.Password();
		
	}
}
