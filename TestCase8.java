package SeleniumLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase8 extends TestCase7 {
	
  @Test
  public void contactAdmin() {
	  driver.get("https://alchemy.hguy.co/lms");
	  WebElement Contact = driver.findElement(By.id("menu-item-1506"));
	    Contact.click();
	  
	    WebElement fullName=driver.findElement(By.id("wpforms-8-field_0"));
	    fullName.sendKeys("Dinesh kumar");
	    
	    WebElement email=driver.findElement(By.id("wpforms-8-field_1"));
	    email.sendKeys("testd@ibm.com");
	    
	    WebElement subject=driver.findElement(By.id("wpforms-8-field_3"));
	    subject.sendKeys("Test");
	    
	    WebElement message=driver.findElement(By.id("wpforms-8-field_2"));
	    message.sendKeys("Test");
	    
	    WebElement submitButton=driver.findElement(By.name("wpforms[submit]"));
	    submitButton.click();
	    
	    WebElement msgContent = driver.findElement(By.id("wpforms-confirmation-8"));
	    String MsgContent = msgContent.getText();
	    
	    System.out.println("Message displayed after submission is: " +MsgContent);
	    Reporter.log("Message displayed is: " +MsgContent); 
  }
}
