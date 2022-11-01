package Inheritance;

public class MultilevelFinal {
	public static void main(String args[])
	{
		Multilevel3 obj = new Multilevel3();
		obj.add();
		obj.mul();
		obj.sub();
		System.out.println("*************************************************************");
		Multilevel2 obj1 = new Multilevel2();
		obj1.add();
		
		obj1.sub();
		System.out.println("*************************************************************");
		Multilevel obj2 = new Multilevel();
		obj2.add();
		
	}

}
