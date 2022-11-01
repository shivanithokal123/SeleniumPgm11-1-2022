package Gropidemo;

import org.testng.annotations.Test;

public class Testcasegropping {
	
	@Test(groups= {"regression","sanity"})
	//if in xml file i will include =regression so only regression test case are excuting 
	public void Test1() {
		System.out.println("Test Case 1");
	}
	
	@Test(groups = { "sanity "})
	public void Test2() {
		System.out.println("Test Case 2" );
	}
	
	@Test(groups = {"smoke"})
	public void Test3() {
		System.out.println("Test Case 2" );
	}
	
	@Test(groups = {"sanity","smoke"})
	public void Test4() {
		System.out.println("Test Case 3" );
	}
	
	@Test(groups = {"smoke"})
	public void Test5() {
		System.out.println("Test Case 4" );
	}
	

}
