package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class initiate_driver {
public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tldriver= new ThreadLocal<>();

	public WebDriver initdriver() {
		
	 tldriver.set(new ChromeDriver());
	getDriver().manage().deleteAllCookies();
	getDriver().manage().window().maximize();
	return getDriver();
	 
	 
	}
	public static WebDriver getDriver() {
		return tldriver.get();
	}
}
