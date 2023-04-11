 package POMclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	WebDriver driver;
	@FindBy (xpath="//input[@name='username']")
	private WebElement phoneNumberUsernameorEmailAddress;
	
	@FindBy (xpath="//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement login;
	
	@FindBy (xpath="//span[text()='Log in with Facebook']")
	private WebElement loginWithFacebook;
	
	@FindBy (xpath="//span[text()='Sign up']")
	private WebElement signup;
	
	@FindBy (xpath="//a[text()='Forgot password?']")
	private WebElement forgottenYourPassword;
	
	public Signin (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public void sendEmailOrPhone(String email) {
		phoneNumberUsernameorEmailAddress.sendKeys(email);
	}
	
	public void sendPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickOnLogIn() {
		login.click();
	}
	
	public void clickOnLogInWithFacebook() {
		loginWithFacebook.click();
	}
	
	public void clickOnSignUp() {
		signup.click();
	}
	
	public void clickOnForgottenYourPassword() {
		forgottenYourPassword.click();
	}

}
