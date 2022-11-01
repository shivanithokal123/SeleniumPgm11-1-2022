package myPackage;

public class Datatypes_NonStaticMethod {
	public static void main(String args[]) 
	{
		Datatypes_NonStaticMethod a1 = new Datatypes_NonStaticMethod();
		a1.method1();
		a1.method2();
		a1.method3();
		a1.method4();
		a1.method5();
		a1.method6();
		a1.method7();
		a1.method8();
	}
		public void method1() {
			byte a =127;
			System.out.println(a);
			}
		public void method2() {
				boolean b = true;
					System.out.println(b);
				}
		public void method3() {
				short c =32765;
				System.out.println(c);
		}
		public void method4() {
				char d = 'a';
				System.out.println(d);
		  }
		public void method5() {
				int e=1234;
				System.out.println(e);
		  }
		public void method6() {
				long f=213456778L;
				System.out.println(f);
		  }
		public void method7() {
				float g=5.5f ;
				System.out.println(g);
		}
		public void method8() {
				double h = 2.5;
				System.out.println(h);
		}
}


