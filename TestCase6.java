package SeleniumLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCase6 extends TestCase5 {
  
@Test
  public void loggingMyAccount() {
	  driver.get("https://alchemy.hguy.co/lms");
	  WebElement myAccount = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
	  myAccount.click();
	  String Title = driver.getTitle();
	  System.out.println("Title of the page is : " + Title);
	  Assert.assertEquals("My Account – Alchemy LMS", Title);
	  WebElement login = driver.findElement(By.xpath("//*[@href='#login']"));
	  login.click();
	  WebElement username = driver.findElement(By.xpath("//input[@id='user_login']"));
	  username.sendKeys("root");
	  WebElement password = driver.findElement(By.xpath("//input[@id='user_pass']"));
	  password.sendKeys("pa$$w0rd");
	  WebElement submitButtom = driver.findElement(By.xpath("//input[@id='wp-submit']"));
      submitButtom.click();
	  WebElement profileDisplaye = driver.findElement(By.className("ld-section-heading"));
	  profileDisplaye.isDisplayed();
  }
}
