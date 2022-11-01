package OwnPgm;

public class ThisKeyword_diffrentVariable { 
	int a;
	String name;
	float b=2.5f;
	public  void xyz(int e , String lname , float f)//we cannot use static method because it varible declared global cannot use in static method
	{
		a=e;
		name=lname;
		b=f;
		System.out.println(a);
		System.out.println(name);
		System.out.println(b);
	}
	public static void main (String args[]) {
		ThisKeyword_diffrentVariable obj=new ThisKeyword_diffrentVariable ();
		obj.xyz(1, "shruti", 2.2f);//assigned this value in xyz method bt its printing global vale
				
	}
}
