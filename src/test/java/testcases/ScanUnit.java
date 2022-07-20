package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BasicBaseFile;




public class ScanUnit extends BasicBaseFile  {
	
	@Test( description = "providing the BCN")
	public void UnitScan() throws InterruptedException {
		
		Thread.sleep(4000);
		//Checking the BCN path depending on Client
		if (prop.getProperty("Client").equalsIgnoreCase("DELL CAR")) {
			 //Providing the BCN value for Dell CAR
			driver.findElement(By.xpath("//*[@id=\"unitIdentificationValue\"]")).sendKeys(prop.getProperty("BCN"));
								
		}
				
		else if(prop.getProperty("Client").equalsIgnoreCase("HP")) {
			 //Providing the BCN value for HP
			driver.findElement(By.xpath("//*[@id=\"discrepancyunitIdentificationValue\"]")).sendKeys(prop.getProperty("BCN"));				
		}
		
		Thread.sleep(1000);
		// clicking on Arrow button
		driver.findElement(By.xpath("//div[5]/button/span/mat-icon")).click();
		Thread.sleep(7000);
		
		
	}
	

}
