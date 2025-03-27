package AmazonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.Seleniumgenerics;

public class AmazonHomepage extends Seleniumgenerics {
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchBox;

	@FindBy(id = "nav-search-submit-button")
	private WebElement searchIcon;

//	@FindBy(xpath = "//div[@class='MoPwtI']")
//	private WebElement searchBox1;

	public void searchProduct(String text) throws InterruptedException {
		enterText(searchBox, text);
		click(searchIcon);
		
	}
	
	
}
