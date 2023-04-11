package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMclass.SelectDOB;
import POMclass.Signin;
import POMclass.Signup;

public class LogInpageButton {
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Automation\\3rd Month 13.01.2023\\Selenium 25.01.23\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com");
	Signin signin = new Signin(driver);
//	signin.sendEmailOrPhone(email);
//	signin.sendPassword();
	signin.clickOnLogIn();
	
	
//	
//	Signin signin = new Signin(driver);
//	signin.clickOnLogInWithFacebook();
//	Signin signin = new Signin(driver);
//	signin.clickOnSignUp();
	    
//		
//		
//		
//	SelectDOB selectDOB = new SelectDOB(driver);
//	selectDOB.selectMonthOfBirth();
//	selectDOB.selectdayOfBirth();
//	selectDOB.selectYearOfBirth();
	
	}
}
