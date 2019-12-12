package ups.pack.login.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingPageElements {

	WebDriver driver;
	
		public ShippingPageElements(WebDriver driver) {
			this.driver =driver;
		}
		
		//public LoginPageElements(WebDriver driver) {
			//this.driver = driver;
		//}
	
		//public WebElement userID() {
		//	WebElement userID = driver.findElement(By.name("userID"));
		//	return userID;
		//}
		
		public Select selectCountry() {
			Select selectCountry = new Select(driver.findElement(By.xpath("//*[@id=\"origincountry\"]")));
			selectCountry.selectByVisibleText("Italy");
			return selectCountry;
		}
		
		// identify element name by xpath
		public WebElement name() {
			WebElement name = driver.findElement(By.name("organization"));
			return name;
		}
		
		public WebElement cName() {
			WebElement cName = driver.findElement(By.xpath("//*[@id=\"origincontactName\"]"));
			return cName;	
		}
		
		public WebElement cancelShipment() {
			WebElement cancelShipment = driver.findElement(By.xpath("//*[@id=\"nbsBackForwardNavigationCancelShipmentButton\"]"));
			return cancelShipment;
		}
		
		public WebElement yes() {
			WebElement yes = driver.findElement(By.xpath("//*[@id=\"nbsCancelShipmentWarningYes\"]"));
			return yes;
			//*[@id="nbsBackForwardNavigationCancelShipmentButton"]

			//*[@id="nbsCancelShipmentWarningYes"]
			
			//*[@id="ups-main"]/div[8]/app/modal-loader/ng-component/common-modal/div[1]/div/div/div[1]/h2
		}
		
		public WebElement msg( ) {
			WebElement msg = driver.findElement(By.xpath("//*[@id=\"ups-main\"]/div[8]/app/modal-loader/ng-component/common-modal/div[1]/div/div/div[1]/h2"));
			return msg;
		}
}
		
