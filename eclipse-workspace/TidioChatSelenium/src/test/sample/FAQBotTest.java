package test.sample;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Eliza Zych
 * Verification F.A.Q Bot on https://www.tidiochat.com/
 *
 */

class FAQBotTest extends Conditions{

	
	@Test
	void openByBlueButton() throws IOException {
		preconditions();
		driver.findElement(By.xpath(findXpath("ThreePoints"))).click();
		driver.findElement(By.xpath(findXpath("PlayButton"))).click();
		driver.findElement(By.xpath(findXpath("TalkButton"))).click();
		boolean botMessage = driver.findElement(By.xpath(findXpath("BotMessages"))).isDisplayed();
		boolean botInformation = driver.findElement(By.xpath(findXpath("BotInformation"))).isDisplayed();
		driver.close();
		System.out.println("BotMessage: " + botMessage);
		System.out.println("BotInfromation: " + botInformation);
	}

	@Test
	void getTextFromBot() throws IOException {
		preconditions();
		driver.findElement(By.xpath(findXpath("ThreePoints"))).click();
		driver.findElement(By.xpath(findXpath("PlayButton"))).click();
		driver.findElement(By.xpath(findXpath("TalkButton"))).click();
		element = driver.findElement(By.xpath(findXpath("BotMessages")));
		String botMessages = element.getText();
		System.out.println(botMessages);
		
	}
	
	@Test
	void botInformation() throws IOException {
		preconditions();
		driver.findElement(By.xpath(findXpath("ThreePoints"))).click();
		driver.findElement(By.xpath(findXpath("PlayButton"))).click();
		driver.findElement(By.xpath(findXpath("TalkButton"))).click();
		element = driver.findElement(By.xpath(findXpath("BotInformation")));
		String botMessages = element.getText();
		System.out.println(botMessages);
		
	}
	
}
