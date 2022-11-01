package OwnPgm;

import java.util.Scanner;

public class usercalculator {
	static usercalculator obj = new usercalculator();
	public static void main(String args[])
	{
		obj.xyz();
		
	}
	public void AssigmentOperation(int a, int b)
	{
		Scanner t= new Scanner(System.in);
		
		
		System.out.println("Choose \n  1.Addition \n  2.Substraction \n  3.Multiplication \n  4.Division");
		
		int c = t.nextInt();
		switch(c)
		{
		
			case 1 :
				System.out.println("a+b is :\t "+(a+b));
			break;
			case 2 :
				System.out.println("a-b is:\t"+(a-b));
				break;
			case 3 :
				System.out.println("a*b is:\t"+a*b);
			break;
			case 4 :
				System.out.println("a/b is:\t"+ a/b);
				break;
			default: 
				System.out.println("Wrong Assigment operator ");
				break;
		}
		obj.exitoperation();
		}
	
		public void exitoperation() {
			System.out.println("Do you want to exicute again yes or no 'yes'\'no' ");
			
			
			Scanner s2 =new Scanner(System.in);
			String d=s2.nextLine();
			switch(d)
			{
				case "yes":
					obj.xyz();
				break;
				case "no":
					System.out.println("Thanks");
				break;
				default:
					System.out.print("Opps Wrong Choise ");
					obj.exitoperation();
				break;
					
			}
			
		}
		public void xyz() {
			int a,b;
			Scanner s =new Scanner(System.in);
			
			
			System.out.println("Enter value of a");
		a=s.nextInt();
		
			System.out.println("Enter value of b");
			b=s.nextInt();
//			usercalculator obj = new usercalculator();
			
			obj.AssigmentOperation(a,b);
		}

	}

