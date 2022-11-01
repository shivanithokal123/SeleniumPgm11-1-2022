package OwnPgm;

public class Pgm_ThisKeyword { 
	int a=20;
	int b=21;
	public static void main(String args[])
	{
		Pgm_ThisKeyword obj=new Pgm_ThisKeyword();
		obj.xyz();
		
	}
	public void xyz () {
		int a=10;
		int b=12;
		b=this.b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);//we can access global variable in local variable bt same varible is must and we can diffrent value 
		//it is happpen only in non static bcoz global variable cannot access in static method
	}
}
