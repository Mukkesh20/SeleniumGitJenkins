package module2;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class2 {

	
	@BeforeMethod
	public void beforeMethod2() {
		System.out.println("beforeMethod2 executed");
	}
	
	@Test 
	@Story("Story")

	public void test1() {
		System.out.println("test21 wefw executed");
	}
	
	@Test 
	public void test2() {
		System.out.println("test22 executed");
	}
	
	@AfterMethod
	public void afterMethod2() {
		System.out.println("afterMethod2 executed");
	}
	
}
