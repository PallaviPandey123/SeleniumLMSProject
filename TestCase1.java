package SeleniumLMS;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase1 {
	WebDriver driver;
	
	 @BeforeMethod
	  public void openBrowser() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
	  }
	 
	 
  @Test
  public void validateTitle() {
	  driver.get("https://alchemy.hguy.co/lms");
	  System.out.println("Page Title is : " +driver.getTitle());
	  Assert.assertEquals("Alchemy LMS – An LMS Application", driver.getTitle());
  }
 

  @AfterMethod
  public void closeBrowser() {
	  driver.close();
  }

}
