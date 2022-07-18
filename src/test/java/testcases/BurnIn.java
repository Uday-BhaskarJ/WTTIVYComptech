package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BasicBaseFile;

public class BurnIn extends BasicBaseFile {
	
	//Burn in details task checking
	@Test
	public static void BurnIn_Details() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-1\"]/span")).click(); // Expanding the task
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-1\"]/span")).click(); // minimize the task	
		
	}

	// Initial Assessment task in Burn in screen
	@Test
	public static void InitalAssessment() {
		
		//Selecting the Print Label check box
		driver.findElement(By.xpath("//*[@id=\"mat-checkbox-1\"]/label/div")).click();
		//click on Complete Button
		driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-2\"]/mat-action-row/app-button/div/button")).click();
		
	}
	
	
	//Print task in Burn in	
	@Test
	public static void PrintLabel() throws InterruptedException {
		Thread.sleep(1000);
		// Complete button in PrintLable task
		driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/mat-action-row/app-button/div/button/span")).click();
		
	}
}



