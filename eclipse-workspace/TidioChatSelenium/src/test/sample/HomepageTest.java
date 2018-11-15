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

	
	@Test
	void talkOnChat() throws IOException {
		elementsCSV = ElementsCSV.setElements("xpaths.csv");
		driver.manage().window().maximize();
		driver.get(webSite);
		driver.switchTo().frame(iFrame);
		driver.findElement(By.xpath(findXpath("Chat", elementsCSV))).click();
		boolean checkButton = driver.findElement(By.xpath(findXpath("Close", elementsCSV))).isDisplayed();
		System.out.println("Button is visible: " + checkButton);
		driver.findElement(By.xpath(findXpath("ButtonBody", elementsCSV))).click();
		driver.findElement(By.xpath(findXpath("Close", elementsCSV))).click();
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
