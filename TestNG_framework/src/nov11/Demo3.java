package nov11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo3 {
WebDriver driver;
@Test
public void verifyTitle()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https:google.com");
	String Expected = "google";
	String Actual = driver.getTitle();
	try {
		Assert.assertFalse(Actual.equalsIgnoreCase(Expected),"Title is matching");
		
	} catch (AssertionError e) {
		System.out.println(e.getMessage());
	}
	driver.quit();
}

}
