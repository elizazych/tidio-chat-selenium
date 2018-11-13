package test.sample;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Conditions {

	
	public WebDriver driver = new FirefoxDriver();
	public WebElement element;
	public String webSite = "https://www.tidiochat.com/";
	public String iFrame =  "tidio-chat-iframe";

	
	public 	void preconditions() {
		driver.manage().window().maximize();
		driver.get(webSite);
		driver.switchTo().frame(iFrame);
	}
	
	public String findXpath(String key) throws IOException {
		List <ElementsCSV> elements = ElementsCSV.setElements("xpaths.csv");
		String xpath=null;
		for(ElementsCSV item : elements) {
			if(item.getKey().compareTo(key)==0) {
				xpath = item.getXpath();
			}
		}
		return xpath;
	}
	

	
}
