package module1;

import org.testng.annotations.Test;

import io.qameta.allure.Description;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class3 {
	
	
	@BeforeTest
	public void beforeTest3() {
		System.out.println("beforeTest3 executed");
	}
	
	@BeforeMethod
	public void beforeClass3() {
		System.out.println("beforeClass3 executed");
	}
	
	@Test 
	@Description("Test Description")
	public void test1() {
		System.out.println("test31 executed");
	}
	
	@Test 
	public void test2() {
		System.out.println("test32 executed");
	}
	
	@Test 
	public void test3() {
		System.out.println("test33 executed");
	}
	
	@AfterMethod
	public void afterClass3() {
		System.out.println("afterClass3 executed");
	}
	

}
