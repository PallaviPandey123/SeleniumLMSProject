package SeleniumLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends TestCase2{
  @Test
  public void firstInfoBoxTitle() {
	  driver.get("https://alchemy.hguy.co/lms");
	  WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Actionable Training')]"));
      String infoBoxTitle = element.getText();	
      //Print the heading title of the page
      System.out.println("Title of first info box is: " + infoBoxTitle);
      //Assertion for page title
      Assert.assertEquals("Actionable Training", infoBoxTitle); 
  }
}
