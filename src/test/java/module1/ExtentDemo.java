package module1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import io.qameta.allure.Description;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.qameta.allure.Story;


public class ExtentDemo {
	static ExtentTest test;
	static ExtentReports report;


	@BeforeSuite
	public static void startTest()
	{
		System.out.println("Suite");
		report = new ExtentReports(System.getProperty("user.dir")+"/ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
	}

	@Test
	@Story("ExtentReport")
	public void extentReportsDemo()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/gajendrasingh/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		String title = driver.getTitle();
		if(title.equals("Google"))
		{
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
			test.log(LogStatus.FAIL, "Test Failed");
		}
		driver.quit();
	}

	@AfterSuite
	public static void endTest()
	{
		report.endTest(test);
		report.flush();
	}
}
