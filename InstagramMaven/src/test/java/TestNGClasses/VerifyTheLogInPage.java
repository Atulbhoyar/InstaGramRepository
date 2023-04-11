package TestNGClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
import Utils.Utility;


public class VerifyTheLogInPage extends Bclass {
	
	
	WebDriver driver;
	Signin signin;
	
	
	@Parameters  ("browser")
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
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
//		if (browser.equals("Firefox"))
//		{
//			driver=Bclass.openFirefox();
//		}
	}
	
	@BeforeClass
	public void POMObjects(){
		signin = new Signin(driver);

	}
	
	@BeforeMethod
	public void openInstagram(){
		 
		driver.get("https://www.instagram.com");
		
	}
	
	
	@Test
	public void verifyTheLogInButton() throws IllegalStateException, IOException, InterruptedException{
//		Utility.captureScreenshot();
	    String data=Utility.dataGettingMethod("Sheet1", 1, 0);
	    signin.sendEmailOrPhone(data);
//		signin.sendEmailOrPhone(Utility.getData("Sheet1", 1, 0));
//		signin.sendEmailOrPhone("atulbhoyar34@gmail.com");
		Thread.sleep(2000);
		data=Utility.dataGettingMethod("Sheet1", 1, 1);
		signin.sendPassword(data);
//		signin.sendPassword(Utility.getData("Sheet1", 1, 1));
//		signin.sendPassword("Atul@1234");
		signin.clickOnLogIn();
	}
	
	@Test
	public void verifyFirstLogInWithFacebookButton (){
//		Utility.captureScreenshot();
		signin = new Signin(driver);
		signin.clickOnLogInWithFacebook();
		
	}
	
	@Test
	public void verifyForgottenYourPasswordButton(){
//		Utility.captureScreenshot();
		signin = new Signin(driver);
		signin.clickOnForgottenYourPassword();
		
	}
	
	@AfterMethod
	public void afterMethod(){
//		driver.close();
		
		
	}
	@AfterClass
	public void afterClass(){
//		driver.quit();
	}
	@AfterTest
	public void aftertest(){
		driver.close();
		System.out.println("aftertest");
	}

}
