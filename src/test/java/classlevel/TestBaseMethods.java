package classlevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import AmazonPages.AmazonHomepage;
import FlipKartpages.SearchPage;
import commons.Seleniumgenerics;

public class TestBaseMethods extends Seleniumgenerics {

	public WebDriver driver =null;
	public SearchPage searchpage;
	public AmazonHomepage amazon;
	
	public ThreadLocal< WebDriver> td =new ThreadLocal<WebDriver>();
	
	
	public WebDriver getDriver() {
		return td.get();
	}

	public void setDriver(WebDriver d) {
		this.td.set(d);
	}

	@BeforeMethod
	@Parameters("browser")
    public void beforeMethod(String text) {
		this.driver=openBrowser(text);
		setDriver(driver);
		
		getUrl(getDriver(), "https://www.flipkart.com/");
		searchpage =PageFactory.initElements(driver, SearchPage.class );
		amazon=PageFactory.initElements(driver, AmazonHomepage.class);
	}
	
	@AfterMethod
	public void afterMethod() {
		
		close(getDriver());
	}
	
}
