package ups.pack.testRunner;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ups.pack.baseDriver.BaseDriverClass;
import ups.pack.login.PageActions.ShippingPageActions;

public class UpsShippingTest extends BaseDriverClass {
	WebDriver driver = getChromeDriver();
	ShippingPageActions ShippingAction = new ShippingPageActions(driver);
		
	@BeforeTest
		public void beforeMethod() {
	
	// FOR CHROME
			driver.get("https://www.ups.com/ship/guided/origin?tx=5614715613706317&loc=en_US");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	}

	@Test
	
	public void ShippingTest() {
		ShippingAction.inputName();
		ShippingAction.inputcName();
		ShippingAction.selectCountry();
		ShippingAction.cancelShipment();
		
		
		String errorMsg = ShippingAction.msg();
		
			if(errorMsg.contains("cancel")) {
				System.out.println("My Message =  Test Passed");
			} else {
				System.out.println("My Message =  Test failed");
			fail("Error");
			}
		//ShippingAction.yes(); 
		
		//String actual = abc;
		//String expected = bca;
		
		//Assertion a - new Assertion();
		//a.assertEquals("abc", "bca");
		
		// assertion if test case fails.. it will not continue	.. 
		// but for verify.. it will verify the case and continue the method...	
		
		// search for soft assert...
		
		//assert.  too see commands
		
	}

	@AfterTest
	public void afterTest() {
		System.out.println("test finished ");
		driver.close();
		
	}
	
}
