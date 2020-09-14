package SeleniumLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCase5 extends TestCase4{
	
  @Test
  public void myAccount() {
	  driver.get("https://alchemy.hguy.co/lms");
	  WebElement MyAccount = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
	  MyAccount.click();
	  String Title = driver.getTitle();
	  System.out.println("Title of the page is : " + Title);
	  Assert.assertEquals("My Account – Alchemy LMS", Title);
  }
}
