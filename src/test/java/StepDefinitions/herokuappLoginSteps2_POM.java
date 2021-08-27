package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import applicationPages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class herokuappLoginSteps2_POM {

	WebDriver driver= null; 
	loginPage login;

	@Given("Browser is open")
	public void browser_is_open() {

		String projectPath = System.getProperty("user.dir");
		System.out.println("Browser is open successfully");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		

	}

	@And("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on login page");


		driver.navigate().to("https://the-internet.herokuapp.com/login");
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {

		login = new loginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);

	}

	@And("User clicks on login page")
	public void user_clicks_on_login_page(){
		login.clickLoginButton();

	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {

		login.verifySuccessMessage();
		driver.close();
		driver.quit();
	}
}
