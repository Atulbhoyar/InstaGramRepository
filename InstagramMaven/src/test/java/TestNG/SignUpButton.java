package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMclass.Signin;
import POMclass.Signup;

public class SignUpButton {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Automation\\3rd Month 13.01.2023\\Selenium 25.01.23\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 
	driver.get("https://www.instagram.com");
	Signin signin= new Signin(driver);
	signin.clickOnSignUp();
	Signup signup=new Signup(driver);

	signup.sendfullName();
	signup.sendUsername();
	signup.sendPassword();
	signup.sendEmailOrPhone();
	signup.clickSignUp();

   }
}
