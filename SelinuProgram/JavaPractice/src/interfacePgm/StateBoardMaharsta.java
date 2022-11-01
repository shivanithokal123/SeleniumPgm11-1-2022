package interfacePgm;

 public class StateBoardMaharsta  implements Amravati_University {
	 public void JSPM(){
		 System.out.println("welcome to JSPM");
 }


 public void RamdevBaba() {
		System.out.println("welcome to RamdevBaba");
		
	}


 public void PD() {
	
	System.out.println("welcome to PD");
 }


	public void RaiSoni() {
	 System.out.println("welcome to RaiSoni");
	
}

	public void MIT() {
		System.out.println("welcome to MIT");
		
	}

	public void DYPatil() {
		System.out.println("welcome to DYPatil");
		
	}

	public void HVPM() {
		System.out.println("welcome to HVPM");		
	}
	
	
	public void IBSS() {
		System.out.println("welcome to IBSS");		
	}
	
	public void RamMegha() {
		System.out.println("welcome to RamMegha");		
	}
	public static void main(String args[]) {
		StateBoardMaharsta obj=new StateBoardMaharsta();
		obj.MIT();
		obj.JSPM();
		obj.IBSS();
		obj.HVPM();
		obj.DYPatil();
		obj.RamdevBaba();
		obj.PD();
		obj.RaiSoni();
		obj.RamMegha();
		Pune_University.student();
	}
}
