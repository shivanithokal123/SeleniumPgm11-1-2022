package OwnPgm;

public class MethodOverloading {
	public static void main(String args[]) {
		MethodOverloading.cricket(1,2);
		
		MethodOverloading x=new MethodOverloading();
		x.cricket(3,3.4f);
		MethodOverloading.cricket(2);
		
	}
	public static void cricket(int a,int b){
		System.out.println(a);
		
	}
	public static void cricket(int a) {//same method name bt diffent no of parameters or data tye
		System.out.println(a);
	}
	public void cricket(int a,float b) {
		System.out.println(a);
		
	}
}
