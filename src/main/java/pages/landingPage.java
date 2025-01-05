package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class landingPage {
	private WebDriver driver;
public landingPage(WebDriver driver) {
	this.driver=driver;
}
public newTaskPage createNewTask() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.switchTo().frame("mainpanel");
	Actions action= new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[text()='Tasks']"))).build().perform();
	driver.findElement(By.xpath("//a[text()='New Task']")).click();
	return new newTaskPage(driver);
}
public newContactPage createnewContact() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.switchTo().frame("mainpanel");
	Actions action= new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[text()='Contacts']"))).build().perform();
	driver.findElement(By.xpath("//a[text()='New Contact']")).click();
	return new newContactPage(driver);
}
}
