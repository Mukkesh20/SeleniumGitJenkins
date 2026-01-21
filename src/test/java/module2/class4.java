package module2;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Step;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


	
	
	@BeforeMethod
	public void beforeMethod4() {
		System.out.println("beforeMethod4 executed");
	}
	@Test 
	@Step("Step")

	public void test1() {
		System.out.println("test41 executed");
	}
	
	@Test 
	public void test2() {
		System.out.println("test42 executed");
	}
	
	@AfterMethod
	public void afterMethod4() {
		System.out.println("afterMethod4 executed");
	}
	
}
