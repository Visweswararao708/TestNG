package nov11;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class FirstTestNGClass {
	WebDriver driver;
	@BeforeTest
	public void beforeTest () {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		Reporter.log("Running in beforetest",true);
	}
	
	@Test
	public void admin() {
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		Reporter.log("Excuting admin test",true);
	}
	@Test
	public void pim() {
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
		Reporter.log("Excuting pim test",true);
	}
	@Test
	public void leave() {
		driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
		Reporter.log("Excuting leave test",true);
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
		Reporter.log("Running in aftertest",true);
	}

}
