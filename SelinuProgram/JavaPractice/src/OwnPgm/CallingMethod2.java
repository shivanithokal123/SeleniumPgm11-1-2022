package OwnPgm;

public class CallingMethod2 {
	public static void main (String args[])
	{
		CallingMethod1 c=new CallingMethod1();
				c.bike1(15);
		CallingMethod1.bike(10);//take class name of prioous class for calling method in diffrent class 
	}

}
