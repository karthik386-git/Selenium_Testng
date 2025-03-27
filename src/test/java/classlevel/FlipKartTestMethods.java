package classlevel;

import org.testng.annotations.Test;

import FlipKartpages.SearchPage;

public class FlipKartTestMethods extends TestBaseMethods{
	
	@Test

	public void TC1() throws InterruptedException {
		amazon.searchProduct("I phone");
		System.out.println(getCurrentUrl(driver));
		
	}
	@Test

	public void TC2() throws InterruptedException {
		amazon.searchProduct("I phone");
		System.out.println(getTitle(driver));
		
	}
}
