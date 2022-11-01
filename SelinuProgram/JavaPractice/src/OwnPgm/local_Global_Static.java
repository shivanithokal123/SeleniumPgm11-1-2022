package OwnPgm;

public class local_Global_Static {
	
static  int b = 12;
	
	public static void main(String args[])
	
{
		
		local_Global_Static a1 = new local_Global_Static();
		a1.localv1();
		a1.localv2();
	   
		System.out.println(b);
}
	public void localv1()
	{
		int a = 10;
		System.out.println(a);
	}
	public void localv2()
	{
		System.out.println(b);
	}
}
