package module1;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class1 {
	
	
	
	
	
	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("beforeMethod1 executed");
	}
	@Test 
	@Epic("Epic")

	public void test1() {
		System.out.println("test11 executed");
	}
	
	@Test 
	public void test2() {
		System.out.println("test12 executed");
	}
	
	@Test 
	public void test3() {
		System.out.println("test13 executed");
	}
	
	@Test 
	public void test4() {
		System.out.println("test14 executed");
	}
	
	@AfterMethod
	public void afterMethod1() {
		System.out.println("afterMethod1 executed");
	}


}
