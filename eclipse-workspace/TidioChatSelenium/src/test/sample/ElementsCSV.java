package test.sample;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ElementsCSV {

	public String xpath;
	public String key;
	
	public ElementsCSV(String key, String xpath) {
		this.key = key;
		this.xpath = xpath;
	}

	public String getXpath() {
		return xpath;
	}

	public void setXpath(String xpath) {
		this.xpath = xpath;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public static List <ElementsCSV> setElements(String fileIn) throws IOException{
		List <ElementsCSV> elementsCSV = new ArrayList<ElementsCSV>();
			  String line = null;
		  FileReader fileReader = new FileReader(fileIn);
		  BufferedReader bufferedReader = new BufferedReader(fileReader);

		    while ((line = bufferedReader.readLine()) != null) {
		        String[] temp = line.split(",");
		        String key = temp[0];
		        String xpath = temp[1];
		      
		       
		        elementsCSV.add(new ElementsCSV(key, xpath));
		    }
		    bufferedReader.close();
		return elementsCSV;
	}
	
	
	
}
