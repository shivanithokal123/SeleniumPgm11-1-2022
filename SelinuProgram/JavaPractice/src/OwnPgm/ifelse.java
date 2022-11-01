package OwnPgm;

public class ifelse

{
	int a=10;
	public static void main(String args[])
	{
		ifelse obj=new ifelse();
		obj.xyz();
		ifelse obj1=new ifelse();
		obj1.xyz1();
		
	}

	public void xyz()
	{
		
		
		if(a!=12) {
			System.out.println("if body");//condition true
		}
		else {
			System.out.println("else body");
		}
	}
		
		public void xyz1()
		{
			int b= 15;
			
			
			if(a<b)
			{
				
				System.out.println("hi");
				if(a>b) {
					System.out.println("hello");
				}
				else {
					System.out.println("hmmm");
				}
			}
			
			else {
				System.out.println("bye");
			}
			
		}
		
	}

	
