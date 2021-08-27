package applicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	WebDriver driver =null;

	By text_siblings = By.xpath("//*[@id='content']//div//h4[2]");
	By text_firstRow = By.xpath("//*[@id='content']//div[2]//div[2][@id='sibling-1.3']");
	By text_thirteenRow = By.xpath("//*[@id='content']//div[2]//*[@id=\"siblings\"]//*[@id=\"sibling-13.2\"]");
	String firtRow = "1.3";
	String  thirteenthRow= "13.2";

	public homePage(WebDriver driver) {
		this.driver = driver;
	}

	public void selectSiblings() {

		String isSiblingPresent = driver.findElement(text_siblings).getText();

		System.out.println("Sibling text is as follows :" +isSiblingPresent);
		if(isSiblingPresent.contains("Siblings")) {
			System.out.println("Siblings is present and selected");
		}
		else {
			System.out.println("Siblings is not selected");
		}

	} 

	public void selectFirstRow() {

		String isFirstRowPresent = driver.findElement(text_firstRow).getText();

		System.out.println("First Row text is as follows :" +isFirstRowPresent);

		if(isFirstRowPresent.contentEquals(firtRow)) {
			System.out.println("First row is present and selected");
		}
		else {
			System.out.println("First row is not selected");
		}


	}


	public void selectThirteenthRow() {


		String isThirteenthRowPresent = driver.findElement(text_thirteenRow).getText();

		System.out.println("Thirteenth Row text is as follows :" +isThirteenthRowPresent);

		if(isThirteenthRowPresent.contentEquals(thirteenthRow)) {
			System.out.println("Thirteenth row is present and selected");
		}
		else {
			System.out.println("Thirteenth row is not selected");
		}
	}


}
