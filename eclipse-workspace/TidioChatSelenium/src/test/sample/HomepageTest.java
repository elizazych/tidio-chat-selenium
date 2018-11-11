package test.sample;

import static org.junit.jupiter.api.Assertions.*;

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

class HomepageTest {

	WebDriver driver = new FirefoxDriver();
	WebElement element;
	String webSite = "https://www.tidiochat.com/";
	String iFrame =  "tidio-chat-iframe";
	String xpathBody = ".//*[@id='button-body']";
	String xpathChat = "html/body/div/div/div/div[1]";
	String xpathClose = "html/body/div/div/div/div[1]/div[1]/button";
	String xpathCloseButton = "html/body/div/div/div/div[1]/div[1]/button[1]";
	
	void preconditions() {
		driver.get(webSite);
		driver.switchTo().frame(iFrame);
	}
	
	@Test
	void openChat() {
	
		preconditions();
		driver.findElement(By.xpath(xpathBody)).click();
		driver.close();
		
	}

	@Test
	void checkCloseButton() {
		
		preconditions();
		driver.findElement(By.xpath(xpathChat)).click();
		boolean checkButton = driver.findElement(By.xpath(xpathClose)).isDisplayed();
		driver.close();
		System.out.println("Button is visible: " + checkButton);
		
	}
	
	@Test
	void closeOpenedChat() {
		
		preconditions();
		driver.findElement(By.xpath(xpathBody)).click();
		driver.findElement(By.xpath(xpathCloseButton)).click();
		driver.close();
		
	}
	
	@Test
	void closeChat() {
		
		preconditions();
		driver.findElement(By.xpath(xpathClose)).click();
		driver.close();
		
	}
}
