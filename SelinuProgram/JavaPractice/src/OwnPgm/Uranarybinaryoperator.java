package OwnPgm;

public class Uranarybinaryoperator {
	public static void main (String args[]) {
		int a =10;
		System.out.println("---------Postfix Inc--------");
		System.out.println(a);//10
		System.out.println(a++);//10(here just store the value in a 10 and next print it print a+1)
		System.out.println(a);//11
		int c=13;
		System.out.println("---------Prefix Inc--------");
		System.out.println(c);//10
		System.out.println(++c);//10
		
		int b =12;
		System.out.println("----------Postfix Dec--------");
		System.out.println(b);//12
		System.out.println(b--);//12
		System.out.println(b--);//11
		System.out.println(b);//10
		System.out.println(b--);//10

		System.out.println("---------Prefix Decnc--------");
		int d=5;
		System.out.println(d);//12
		System.out.println(--d);//12
	}
	
}
