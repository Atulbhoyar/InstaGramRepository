package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bclass {
	
	public static WebDriver openChrome() {
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Automation\\3rd Month 13.01.2023\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		return driver;
	}
	
	public static WebDriver openFirefox() {
		System.setProperty("webdriver.gecko.driver", "E:\\Software Testing\\Automation\\3rd Month 13.01.2023\\New folder (2)\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver openEdge() {
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Automation\\3rd Month 13.01.2023\\New folder (2)\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		return driver;
	}

}
