package applicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver;

	By text_username_login = By.name("username");
	By text_password_login = By.name("password");
	By btn_login = By.xpath("//*[@class=\"fa fa-2x fa-sign-in\"]");
	By message_success = By.xpath("//*[@id='flash-messages']");
	String text_message = "secure";

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {

		driver.findElement(text_username_login).sendKeys(username);

	}

	public void enterPassword(String password) {

		driver.findElement(text_password_login).sendKeys(password);

	}

	public void clickLoginButton() {

		driver.findElement(btn_login).click();

	}

	public void verifySuccessMessage() {

		String text =  driver.findElement(message_success).getText();
		System.out.println("value is " + text);

		if(text.contains(text_message)) {
			System.out.println("User is logged in successfully");

		}
		else {
			System.out.println("User is unable to login ");
		}
	}

}

