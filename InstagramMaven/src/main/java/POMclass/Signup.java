package POMclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	WebDriver driver;
	@FindBy (xpath="(//input[@autocapitalize='off'])[1]")
	private WebElement emailOrPhone;
	
	@FindBy (xpath="//input[@name='fullName']")
	private WebElement fullName;
	
	@FindBy (xpath="//input[@name='username']")
	private WebElement userName;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement signUp;
	
	@FindBy (xpath="//span[text()='Sign up']")
	private WebElement logInWithFacebook;
	
	public Signup (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public void sendEmailOrPhone() {
		emailOrPhone.sendKeys("Atulbhoyar34@gmail.com");
	}
	
	public void sendfullName() {
		fullName.sendKeys("Atul bhoyar");
	}
	
	public void sendUsername() {
		userName.sendKeys("Atul678900");
	}
	
	public void sendPassword() {
		password.sendKeys("Atulbhoyar34");
	}
	
	public void clickSignUp() {
		signUp.click();
	}
	
	public void clickOnLogInWithFacebook() {
		logInWithFacebook.click();
	}


}
