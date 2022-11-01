package OwnPgm;

public class nestedif {


	public void xyz() {
		int a=5;
		int b=10;
			if(a<6)//true
			{
				if(a<b)//true
				{
					System.out.println("this is nested if ");
				}
			}
	}
			public static void main(String args[]) {
				
				nestedif obj = new nestedif();
				obj.xyz();
			}
	}
	
