package SeleniumLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCase4 extends TestCase3 {
	
  @Test
  public void secondPopularCourse() {
	  
	  driver.get("https://alchemy.hguy.co/lms");
	  WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Email Marketing Strategies')]"));
	  String SecPopularCourse = element.getText();
	  System.out.println("Title for Second Most Popular Course is : " + SecPopularCourse);
	  Assert.assertEquals("Email Marketing Strategies", SecPopularCourse);
  }
}
