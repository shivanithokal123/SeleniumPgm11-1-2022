package Actual_Expected;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	@Test
	public void Test1() {
			String actual="abc";
			String Expected="abc1";
			Assert.assertEquals(Expected, actual,"Given o/p is not match");
			
			
	}
	@Test
	public void Test2() {
			
			Assert.assertEquals(16, 15);
			
			}
	@Test
	//Hard Assert excute first and if senario fail then other print statment not print but in soft asert all befor and after assert print 
	public void Test3() {
		System.out.println("Test 4 start");//its print 
		Assert.assertEquals(16, 15);
		System.out.println("Test 4 stop");//stop if assert is fail not print this 
			
}
	@Test
	public void Test4() {
			
			Assert.assertTrue(16<15);//for comparison assertTrue method used
			
			
	}
	@Test
	public void Test5() {
			
			Assert.assertTrue(false);//print false becz assertTrue method is used 
			
			
	}
	@Test
	public void Test6() {
			String actual="abc";
			
			Assert.assertTrue(actual.contains("velocity"));//false bcoz acutal=abc and we took velocity
			
			
	}
	@Test
	public void Test7() {
			
			Assert.assertNotEquals(16,15);//for comparison assertTrue method used
			
			
	}
	@Test
	public void Test8() {
			String actual;
			
			Assert.assertNull(0);//here not take even memory create that variable if in project required null value
			
			
	}
	@Test
	//Soft Assert condition 1. create obj 2. call obj 	and it print all if testcase is fail still print before and after test 	
	public void Test9() {
		SoftAssert assertSoft = new SoftAssert();
		System.out.println("Test 4 start"); 
		assertSoft.assertEquals(16, 15);
		System.out.println("Test 4 stop"); 
		assertSoft.assertAll();
			
}
	
}
