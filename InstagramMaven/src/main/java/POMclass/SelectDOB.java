package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectDOB {
	@FindBy (xpath="//select[@title='Month:']")
	private WebElement monthOfBirth;
	
	@FindBy (xpath="//select[@title='Day:']")
	private WebElement dayOfBirth;
	
	@FindBy (xpath="//select[@title='Year:']")
	private WebElement yearOfBirth;
	
	public SelectDOB (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectMonthOfBirth() {
		Select sct=new Select (monthOfBirth);
		sct.selectByVisibleText("May");
	}
	
	public void selectdayOfBirth() {
		Select sct=new Select (dayOfBirth);
		sct.selectByVisibleText("1");
	}
	
	public void selectYearOfBirth() {
		Select sct=new Select (yearOfBirth);
		sct.selectByVisibleText("2000");
	}

}
