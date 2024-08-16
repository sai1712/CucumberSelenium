package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
private WebDriver driver;
public loginPage(WebDriver driver) {
	this.driver=driver;
}
	
	public void getLoginPage() {
		driver.get("https://classic.freecrm.com/");
	}
	public void enterUsername(String username) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	public landingPage doLogin(String username,String password) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		return new landingPage(driver);
	}
	
}
