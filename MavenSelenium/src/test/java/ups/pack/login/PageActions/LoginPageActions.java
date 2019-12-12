package ups.pack.login.PageActions;

import org.openqa.selenium.WebDriver;

import ups.pack.login.pageElements.LoginPageElements;

public class LoginPageActions {

	LoginPageElements loginPageElement; // new int?? putting new services page elements in services element variable?


	public LoginPageActions(WebDriver driver) {
		this.loginPageElement = new LoginPageElements(driver);
	}

	public void inputUserId() {
		loginPageElement.userID().sendKeys("Hello");
	}

	public void inputPassword() {
		loginPageElement.password().sendKeys("World");
	}

	public void submit() {
		loginPageElement.submitButton().click();
	}

	public String readErrorText() {
		String errorText = loginPageElement.errorText().getText();
		return errorText;
	}
}
