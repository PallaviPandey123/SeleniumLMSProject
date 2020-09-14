package SeleniumLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase9 extends TestCase1{
  @Test
  public void completeLesson() {
	  driver.get("https://alchemy.hguy.co/lms");
	  
	  WebElement contact = driver.findElement(By.id("menu-item-1506"));
	  contact.click();
	  
	  WebElement fullName = driver.findElement(By.id("wpforms-8-field_0"));
	  fullName.sendKeys("Pallavi Pandey");
	  
	  WebElement emailAdress = driver.findElement(By.id("wpforms-8-field_1"));
	  emailAdress.sendKeys("pallavi123@ibm.com");
	  
	  WebElement subject = driver.findElement(By.id("wpforms-8-field_3"));
	  subject.sendKeys("Testing");
	  
	  WebElement message = driver.findElement(By.id("wpforms-8-field_2"));
	  message.sendKeys("Testing");
	  
	  WebElement sendButton = driver.findElement(By.id("wpforms-submit-8"));
	  sendButton.click();
	  
	  WebElement msgContent = driver.findElement(By.id("wpforms-confirmation-8"));
	  String MsgContent = msgContent.getText();
	  System.out.println("Message displayed after submission is: " +MsgContent);
	  Reporter.log("Message displayed is: " +MsgContent);
  }
}
