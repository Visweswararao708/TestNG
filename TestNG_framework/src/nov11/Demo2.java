package nov11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
WebDriver driver;
@Test
public void verifyTitle()
{
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	String Expected = "google";
	String Actual = driver.getTitle();
	try {
		Assert.assertTrue(Actual.equalsIgnoreCase(Expected),"Title is not matching");
	}catch(AssertionError e) {
		System.err.println(e.getMessage());
	}
	driver.quit();
}
	

}
