package ups.pack.login.PageActions;

import org.openqa.selenium.WebDriver;

import ups.pack.login.pageElements.ShippingPageElements;

public class ShippingPageActions {

	ShippingPageElements ShippingPageElement;
		
		public ShippingPageActions(WebDriver driver) {
			this.ShippingPageElement = new ShippingPageElements(driver);
		}

		public void selectCountry () {
			ShippingPageElement.selectCountry();
		}
		
		
		public void inputName() {
			ShippingPageElement.name().sendKeys("John");
		}

		public void inputcName() {
			ShippingPageElement.cName().sendKeys("wick");
		}
		
		public void cancelShipment() {
			ShippingPageElement.cancelShipment().click();
		}
		
		public void yes() {
			ShippingPageElement.yes().click();
		}
		
		public String msg() {
			String msg = ShippingPageElement.msg().getText();
			return msg;
		}
}



