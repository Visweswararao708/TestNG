package nov11;

import static org.testng.Assert.assertEquals;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
WebDriver driver;
@Test
public void verifyTitle()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	String Expected = "google";
	String Actual = driver.getTitle();
	try {
		Assert.assertEquals(Expected, Actual,"Title is not matching");
	}catch(AssertionError e) {
	  System.out.println(e.getMessage());
	}
	driver.quit();
}
}
