package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BasicBaseFile;

public class ScanUnit extends BasicBaseFile  {
	
	@Test
	public static void UnitScan() throws InterruptedException {// BCN scan
		
		Thread.sleep(3000);
		driver.findElement(By.name("discrepancyunitIdentificationValue")).sendKeys(prop.getProperty("BCN"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/div[1]/div[5]/button/span/mat-icon")).click();
		Thread.sleep(10000);
		
		
	}
	

}
