package SeleniumLMS;

import org.testng.annotations.Test;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TestCase2 extends TestCase1 {
  @Test
  public void validatePageHeading() {
	  driver.get("https://alchemy.hguy.co/lms");
	  WebElement element = driver.findElement(By.className("uagb-ifb-title"));
	  String PageHeading = element.getText();
	  System.out.println("Page Heading is : " + PageHeading);
	  Assert.assertEquals("Learn from Industry Experts", PageHeading);
  }
  

}
