package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class newTaskPage {
	private WebDriver driver;
public newTaskPage(WebDriver driver) {
	this.driver=driver;
}

public void enterTitle(String title) {
	driver.findElement(By.cssSelector("#title")).sendKeys(title);
}
public void ExtendDropDown(String autoextend) {
	Select select=new Select(driver.findElement(By.xpath("//select[@name='auto_extend']")));
	select.selectByVisibleText(autoextend);
}
public void completion(String value) {
	driver.findElement(By.cssSelector("#completionsai123")).sendKeys(value);
}
public void clickSave() {
WebElement element=driver.findElement(By.xpath("//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]"));
element.click();

}
}
