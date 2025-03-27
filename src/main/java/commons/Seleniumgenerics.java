package commons;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.api.internal.Utils;

public class Seleniumgenerics {

	public Actions a;
	public Select s;
	public TakesScreenshot tk;

	public WebDriver openBrowser(String name) {
		WebDriver driver = null;

		if (name.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (name.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("please choose the browser");
		}
		driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));
		driver.manage().window().maximize();
		return driver;
	}

	public String enterText(WebElement e, String text) {
		e.sendKeys(text);
		return text;
	}

	public void click(WebElement e) {
		e.click();
	}

	public void dragAndDrop(WebDriver driver, WebElement src, WebElement tgt) {
		a = new Actions(driver);
		a.dragAndDrop(src, tgt).perform();
	}

	public void rightClick(WebDriver driver, WebElement e) {
		a = new Actions(driver);
		a.contextClick(e).perform();
	}

	public void moveToElement(WebDriver driver, WebElement e) {
		a = new Actions(driver);
		a.moveToElement(e).perform();
	}

	public String getUrl(WebDriver driver, String url) {
		driver.get(url);
		return url;
	}

	public void quit(WebDriver driver) {
		driver.quit();
	}
	public void close(WebDriver driver) {
		driver.close();
	}

	public String getTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	public void selectByIndex(WebElement e,int i) {
		s=new Select(e);
		s.selectByIndex(i);
	}
	public void selectByValue(WebElement e,String text) {
		s=new Select(e);
		s.selectByValue(text);
	}
	
	public void selectByVisibleText(WebElement e,String text) {
		s=new Select(e);
		s.selectByVisibleText(text);
	}
	
	public void capture(WebDriver driver,String path) throws IOException {
		tk=(TakesScreenshot)driver; 
		File src = tk.getScreenshotAs(OutputType.FILE);	
		File f= new File(System.getProperty("user.dir")+path+".png");
		FileUtils.copyFile(src, f);
	}
	public void clear(WebElement e) {
		e.clear();
	}
	public String getCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}
	
}
