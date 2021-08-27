package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import applicationPages.homePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class herokuappDOMTest {

	WebDriver driver;
	homePage home;

	@Given("Browser is loaded")
	public void user_is_loaded() {
		
		System.out.println("Browser is open successfully");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/chromedriver/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranoti\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("User is on Welcomepage")
	public void user_is_on_welcomepage() {

		driver.navigate().to("https://the-internet.herokuapp.com/large");


	}
	@Then("User selects siblings")
	public void user_selects_siblings() {

		home = new homePage(driver);
		home.selectSiblings();

	}

	@And("User selects first row")
	public void user_selects_first_row() {
		home.selectFirstRow();
	}


	@And("User selects thirteenth row")
	public void user_selects_thirteenth_row() {
		home.selectThirteenthRow();
	}

}
