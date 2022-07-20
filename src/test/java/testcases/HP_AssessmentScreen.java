package testcases;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BasicBaseFile;

public class HP_AssessmentScreen extends BasicBaseFile {
	
		
	//checking the Initial Assessment task
	@Test(priority = 1, description = "completing the Initial Assessment task")		
	public void Initia_Assessment() throws InterruptedException {	
		Thread.sleep(7000);
		//Click on Complete button in Initial Assessment task
		driver.findElement(By.xpath("(//button[@class='mat-focus-indicator body mat-raised-button mat-button-base primary-btn mat-primary ng-star-inserted'])[1]")).click();
	}
	
	//checking and completing the ECN task
		@Test(priority = 2, description = "Completing the ECN Task")		
		public void ECN_Task() throws InterruptedException {
			// Checking the number of ECN task in Assessment screen
			List<WebElement> Count_ActiveTask =driver.findElements(By.xpath("(//button[@class='mat-focus-indicator body mat-raised-button mat-button-base mat-primary ng-star-inserted'])"));
			
			int ECN_Count =Count_ActiveTask.size();
			// In count reduced 3 for complete/submit buttons for HDD,RAM, Next
			for(int i = 1; i<=ECN_Count; i++){
				Thread.sleep(1000);
				// completing the ECN task
				driver.findElement(By.xpath("(//button[@class='mat-focus-indicator body mat-raised-button mat-button-base mat-primary ng-star-inserted'])["+i+"]")).click();
				
			}
			
		}
		
		
	
	
	// Clicking on Next button to navigate to Debug screen
	@Test(priority = 3, description = "Navigating to Debug screen")	
	public void AssessmentScreen_Next() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='mat-focus-indicator body mat-raised-button mat-button-base primary-btn mat-primary ng-star-inserted'])[6]")).click();
		
	}
	

}
