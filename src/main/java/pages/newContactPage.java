package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class newContactPage {
	private WebDriver driver;
public newContactPage(WebDriver driver) {
	this.driver=driver;
}
public void enterTitle(String title) {
	WebElement element=driver.findElement(By.xpath("//select[@name='title']"));
	Select select=new Select(element);
	select.selectByVisibleText(title);
	
}
public void enterFirstName(String name) {
	driver.findElement(By.cssSelector("#first_name")).sendKeys(name);
}
public void enterLastName(String name) {
	driver.findElement(By.cssSelector("#surname")).sendKeys(name);
}
public void clickSave() {
	driver.findElement(By.xpath("//input[@value='Save']")).click();
}
}
