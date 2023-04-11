package TestNGClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.Bclass;
import POMclass.Signin;
import POMclass.Signup;
import Utils.Utility;

public class VerifyTheSignUpPage extends Bclass {
	WebDriver driver;
	Signin signin;
	Signup signup;
	
	
	@Parameters ("browser")
	@BeforeTest
	public void openBrowser(String browser) {
		if (browser.equals("chrome"))
		{
			driver=Bclass.openChrome();
		}
	
		if (browser.equals("Edge"))
		{
			driver=Bclass.openEdge();
		}
	
//		if (browser.equals("Firefox"))
//		{
//			driver=Bclass.openFirefox();
//		}
	}
	
	@BeforeClass
	public void beforeclass() {
		signin = new Signin(driver);
		signup=new Signup(driver);
		
	}
	
	@BeforeMethod
	public void beforemethod() {
		driver.get("https://www.instagram.com");
		
	
	}

	@Test
	public void verifySignUpPageFields() {
//		signin = new Signin(driver);
		signin.clickOnSignUp();
//		signup=new Signup(driver);
		

		signup.sendfullName();
		signup.sendUsername();
		signup.sendPassword();
		signup.sendEmailOrPhone();
		signup.clickSignUp();
		
	}
	@Test
	public void verifyLogInWithFacebbok() {
		
		signin.clickOnSignUp();
		signup=new Signup(driver);
		signup.clickOnLogInWithFacebook();
	}

	@AfterMethod
	public void aftermethod() {
		
	}

	@AfterClass
	public void afterclass() {
		
	}
	@AfterTest
	public void aftertest(){
		driver.close();
		System.out.println("aftertest");
	}

}
