package classlevel;

import org.testng.annotations.Test;

public class AmazonTestCases extends TestBaseMethods {

	@Test

	public void TC1() throws InterruptedException {
		amazon.searchProduct("I phone");
		System.out.println(getCurrentUrl(driver));
		
	}
	


}
