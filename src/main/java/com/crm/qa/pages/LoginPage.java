package com.crm.qa.pages;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	Logger log = Logger.getLogger("devpinoyLogger");
	
	//Page Factory - OR:	
	@FindBy(name="email")	WebElement username;		
	@FindBy(name="password")	WebElement password;		
	@FindBy(xpath="//*[contains(text(),'Log In')]")	WebElement login;		
	@FindBy(xpath="//*[text()='Login']")	WebElement loginBtn;		
	@FindBy(xpath="//span[contains(text(),'Sign Up')]")	WebElement signUpBtn;		
	@FindBy(xpath="//*[@src='/images/cogtiny1.jpg']")	WebElement crmLogo;		
	//Initializing the Page Objects:	
	
	public LoginPage(){		
		PageFactory.initElements(driver, this);	
		}		
	
	//Actions:	
	public String validateLoginPageTitle(){		
		return driver.getTitle();	
		}		
	
	public boolean validateCRMImage(){	
		TestBase.log.debug("CRM Logo");
		return crmLogo.isDisplayed();	
		}		
	
	public HomePage login(String un, String pwd){	
//		JavascriptExecutor js = (JavascriptExecutor)driver;	
//		js.executeScript("arguments[0].click();", signUpBtn);	
		signUpBtn.click();
		username.sendKeys(un);		
		password.sendKeys(pwd);		
		//loginBtn.click();		    	
		//js.executeScript("arguments[0].click();", loginBtn);			
		return new HomePage();	

	}
}