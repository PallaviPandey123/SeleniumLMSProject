package SeleniumLMS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase7 extends TestCase6{
  @Test
  public void courseCount() {
	  driver.get("https://alchemy.hguy.co/lms");
	  WebElement courses = driver.findElement(By.xpath("//a[contains(text(),'All Courses')]"));
	  courses.click();
	  
	  List<WebElement> Course = driver.findElements(By.className("entry-title"));
	  int countofcourses = Course.size();
	  System.out.println("Number of Course on the page : " + countofcourses);
	  Reporter.log("Course Count is: " +countofcourses);
	  for (int i = 0 ; i < countofcourses ; i++)
	    {
	    	int j = i+1;
	    	System.out.println(j+" : "+ Course.get(i).getText());
	    	Reporter.log("Courses"+j+" : " +Course.get(i).getText());
	    }
  }
}
