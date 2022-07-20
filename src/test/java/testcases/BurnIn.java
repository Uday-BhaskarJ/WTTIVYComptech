package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
	public static void InitalAssessment() throws InterruptedException {
		
		Thread.sleep(3000);
		
		//Selecting the Print Label check box
		//driver.findElement(By.xpath("//*[@id=\"mat-checkbox-2-input\"]")).click();
		//click on Complete Button
		driver.findElement(By.xpath("(//button[@class='mat-focus-indicator body mat-raised-button mat-button-base primary-btn mat-primary ng-star-inserted'])[1]")).click();
		
	}
	
	
	//Print task in Burn in	
	@Test
	public static void PrintLabel() throws InterruptedException {
		Thread.sleep(1000);
		// Complete button in PrintLable task
		driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/mat-action-row/app-button/div/button/span")).click();
		
	}
	
	
	
	// selection of result code
	@Test
	public void Result_Code() throws InterruptedException {
		Thread.sleep(3000);
		
		WebElement  Rcode_Dropdown =driver.findElement(By.xpath("(//select[@class='body body2 dropdown-container footer-dropdown ng-untouched ng-pristine ng-valid'])"));
		//Initializing the client drop down
		Select objSelect = new Select(Rcode_Dropdown);
		objSelect.selectByVisibleText("DEBUG");	
		
		
	}
}



