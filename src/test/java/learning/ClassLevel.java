package learning;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassLevel {
	public WebDriver driver = null;

	
	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void flipkart() {
		driver.get("https://www.flipkart.com/");
	}

	@Test
	public void Amazon() {
		driver.get("https://www.amazon.in/");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
