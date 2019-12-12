package ups.pack.login.PageActions;

import org.openqa.selenium.WebDriver;

public class ServicesPageActions {

	ServicesPageActions sa; // putting shipping actions in sa variable?
	
		public ServicesPageActions (WebDriver driver) {
			this.sa = new ServicesPageActions(driver);
			
		}
		
		public void selectCreateShipment() {
			sa.selectCreateShipment();
			
		}
		
}
