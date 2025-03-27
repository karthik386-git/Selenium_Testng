package FlipKartpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.Seleniumgenerics;

public class SearchPage extends Seleniumgenerics{

public WebDriver driver=null;
	
//	public SearchPage(WebDriver driver) {
//		this.driver=driver;
//	}
	@FindBy(name ="q")
	private WebElement searchBox;
	
	@FindBy(className = "_2iLD__")
	private WebElement searchIcon;
	
	@FindBy(xpath="//div[@class='MoPwtI']")
	private WebElement searchBox1;
	
	public void searchProduct(String text ) throws InterruptedException{
		enterText(searchBox, text);
		click(searchIcon);
		
		
	}
}
