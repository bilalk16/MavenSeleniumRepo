package ups.pack.login.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ServicesPageElements {
	
	WebDriver driver; // new variable?
	
	public ServicesPageElements (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement createShipment() {
		WebElement createShipment = driver.findElement(By.xpath("//*[@id=\"ups-banner-ctatxtid5\"]"));
		return createShipment;
	}
	
	

}
