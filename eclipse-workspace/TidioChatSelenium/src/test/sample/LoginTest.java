package test.sample;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

/**
 * @author Eliza Zych
 * Verification login to panel on https://www.tidiochat.com/
 *
 */

class LoginTest extends Conditions{

	
	@Test
	void LoginToPanel() throws IOException {
	
		elementsCSV = ElementsCSV.setElements("xpaths.csv");
		driver.manage().window().maximize();
		driver.get(webSite);
		driver.findElement(By.xpath(findXpath("LoginButton", elementsCSV))).click();
		driver.switchTo().parentFrame();
		try {
		driver.findElement(By.xpath(findXpath("OrButton", elementsCSV))).click();
		}catch(Exception e) {
			System.out.println(e);
		}
		element = driver.findElement(By.xpath(findXpath("EmailLogin", elementsCSV)));
		element.sendKeys("gnj63336@ebbob.com");
		element = driver.findElement(By.xpath(findXpath("Password", elementsCSV)));
		element.sendKeys("toTest123");
		element.sendKeys(Keys.ENTER);
		driver.switchTo().parentFrame();
		 try {
			 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath(findXpath("Chanells", elementsCSV))));
		 }
		 catch(WebDriverException e) {
			 System.out.println(e);
		 }
		driver.findElement(By.xpath(findXpath("Chanells", elementsCSV))).click();
		driver.findElement(By.xpath(findXpath("Pink", elementsCSV))).click();
		driver.findElement(By.xpath(findXpath("Offline", elementsCSV))).click();
		driver.findElement(By.xpath(findXpath("SaveButton", elementsCSV))).click();
		driver.findElement(By.xpath(findXpath("Account", elementsCSV))).click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(findXpath("Logout", elementsCSV))));
		driver.findElement(By.xpath(findXpath("Logout", elementsCSV))).click();
		driver.close();
	}

}
