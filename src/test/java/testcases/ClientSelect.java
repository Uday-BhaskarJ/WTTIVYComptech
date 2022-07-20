package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BasicBaseFile;




public class ClientSelect extends BasicBaseFile {
	
		
	// Selecting Client Location Drop down
	@Test(priority = 1, description = "selection of Client Location")
	public void Location() throws InterruptedException {	
		Thread.sleep(10000);
		// Getting the Client location Drop down path
		WebElement  Client_Location =driver.findElement(By.xpath("(//select[@class='body body2 dashbord-dropdown ng-untouched ng-pristine ng-valid'])[1]"));
		
		  Select objSelect = new Select(Client_Location);
		  // selecting the drop down value
		  objSelect.selectByVisibleText(prop.getProperty("Location"));
		  Thread.sleep(1000);
		}
			
	

	
    // Selection of Client
	@Test(priority = 2, description = "selection of Client ")
	public void Client_Selection() {
		// Getting the Client path
		WebElement  Client_Dropdown =driver.findElement(By.xpath("(//select[@class='body body2 dashbord-dropdown ng-untouched ng-pristine ng-valid'])[2]"));
		//Initializing the client drop down
		Select objSelect = new Select(Client_Dropdown);
		
		if (prop.getProperty("Client").equalsIgnoreCase("DELL CAR")) {
			//selecting the Drop down value for Dell Car
			objSelect.selectByVisibleText("DELL");						
		}
		
		else if(prop.getProperty("Client").equalsIgnoreCase("HP")) {
			//selecting the Drop down value for Dell Car
			objSelect.selectByVisibleText("HP");				
		}

	}
	
	
	@Test(priority = 3, description = "selection of Operation ")
	public void Client_Operation() {		
		WebElement  Client_Operat = driver.findElement(By.xpath("(//select[@class='body body2 dashbord-dropdown ng-untouched ng-pristine ng-valid'])[2]"));
		Select Client_Oper = new Select(Client_Operat);
		
		if (prop.getProperty("Client").equalsIgnoreCase("DELL CAR")) {
			Client_Oper.selectByVisibleText("CAR");
						
		}
		else if(prop.getProperty("Client").equalsIgnoreCase("HP")) {
			//selecting the Drop down value for Dell Car
			Client_Oper.selectByVisibleText("COMMERCIAL");

	    }

     }
	
}
