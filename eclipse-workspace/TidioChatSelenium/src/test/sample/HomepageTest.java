package test.sample;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

/**
 * @author Eliza Zych
 * Verification chat on https://www.tidiochat.com/
 *
 */

class HomepageTest extends Conditions{



	
	/*@Test
	void openChat() throws IOException {
	
		preconditions();
		driver.switchTo().frame(iFrame);
		driver.findElement(By.xpath(findXpath("ButtonBody", elementsCSV))).click();
		driver.close();
		
	}

	@Test
	void checkCloseButton() throws IOException {
		
		preconditions();
		driver.switchTo().frame(iFrame);
		driver.findElement(By.xpath(findXpath("Chat", elementsCSV))).click();
		boolean checkButton = driver.findElement(By.xpath(findXpath("Close", elementsCSV))).isDisplayed();
		driver.close();
		System.out.println("Button is visible: " + checkButton);
		
	}
	
	@Test
	void closeOpenedChat() throws IOException {
		
		preconditions();
		driver.switchTo().frame(iFrame);
		driver.findElement(By.xpath(findXpath("ButtonBody", elementsCSV))).click();
		driver.findElement(By.xpath(findXpath("CloseButton", elementsCSV))).click();
		driver.close();
		
	}
	
	@Test
	void closeChat() throws IOException {
		
		preconditions();
		driver.switchTo().frame(iFrame);
		driver.findElement(By.xpath(findXpath("Close", elementsCSV))).click();
		driver.close();
		
	}
	

	@Test
	void compareTidiusHome() throws IOException {
		preconditions();
		driver.switchTo().frame(iFrame);
		element = driver.findElement(By.xpath(findXpath("TidiusHome", elementsCSV)));
		boolean result = element.getText().contains(findXpath("TidiusHome", getstrings));
		driver.close();
		System.out.println("Text are the same: " + result);
	}
	*/
	@Test
	void talkOnChat() throws IOException {
		preconditions();
		driver.switchTo().frame(iFrame);
		driver.findElement(By.xpath(findXpath("ButtonBody", elementsCSV))).click();
		element = driver.findElement(By.xpath(findXpath("NewMessage", elementsCSV)));
		element.sendKeys("Hi!");
		element.sendKeys(Keys.ENTER);
		element = driver.findElement(By.xpath(findXpath("EmailInput", elementsCSV)));
		driver.findElement(By.xpath(findXpath("CheckButton", elementsCSV))).click();
		element.sendKeys("hpjmgwzrabw5@10minut.xyz");
		element.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(findXpath("CloseButton", elementsCSV))).click();
		driver.close();
	}

}
