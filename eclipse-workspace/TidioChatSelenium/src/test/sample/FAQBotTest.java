package test.sample;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		
		elementsCSV = ElementsCSV.setElements("xpaths.csv");
		getstrings = ElementsCSV.setElements("getstring.csv");
		driver.manage().window().maximize();
		driver.get(webSite);
		driver.switchTo().frame(iFrame);
		element = driver.findElement(By.xpath(findXpath("TidiusHome", elementsCSV)));
		boolean botMessages = element.getText().contains(findXpath("TidiusHome", getstrings));
		driver.findElement(By.xpath(findXpath("ThreePoints", elementsCSV))).click();
		driver.findElement(By.xpath(findXpath("PlayButton", elementsCSV))).click();
		driver.findElement(By.xpath(findXpath("TalkButton", elementsCSV))).click();
		boolean botMessage = driver.findElement(By.xpath(findXpath("BotMessages", elementsCSV))).isDisplayed();
		driver.findElement(By.xpath(findXpath("CloseButton", elementsCSV))).click();
		driver.close();
		System.out.println("BotMessage: " + botMessage);
		System.out.println("Tidius Information are the same: " + botMessages);
		
	}

	


}
