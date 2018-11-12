package test.sample;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
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



	
	@Test
	void openChat() throws IOException {
	
		preconditions();
		driver.findElement(By.xpath(findXpath("ButtonBody"))).click();
		driver.close();
		
	}

	@Test
	void checkCloseButton() throws IOException {
		
		preconditions();
		driver.findElement(By.xpath(findXpath("Chat"))).click();
		boolean checkButton = driver.findElement(By.xpath(findXpath("Close"))).isDisplayed();
		driver.close();
		System.out.println("Button is visible: " + checkButton);
		
	}
	
	@Test
	void closeOpenedChat() throws IOException {
		
		preconditions();
		driver.findElement(By.xpath(findXpath("ButtonBody"))).click();
		driver.findElement(By.xpath(findXpath("CloseButton"))).click();
		driver.close();
		
	}
	
	@Test
	void closeChat() throws IOException {
		
		preconditions();
		driver.findElement(By.xpath(findXpath("Close"))).click();
		driver.close();
		
	}
	
	
}
