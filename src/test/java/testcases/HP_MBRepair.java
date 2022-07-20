package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BasicBaseFile;

public class HP_MBRepair extends BasicBaseFile {
	
	
	//Completing the Initial assessment task
	
	@Test	
	public void MBRepair_InitialAssessment() {
		//completing the complete button in Initial assessment task
		driver.findElement(By.xpath("(//button[@class='mat-focus-indicator body mat-raised-button mat-button-base primary-btn mat-primary ng-star-inserted'])[1]")).click();
	}
	
	
	//completing the Repair details task
	@Test	
	public void MBRepair_RepairDetails() {
		//Providing the value for 'MB CT Number' text box
		driver.findElement(By.id("mbctnumber")).sendKeys("MBCTNumber");
		
		//Providing the value for 'MB PN' text box
		driver.findElement(By.id("mbpartumber")).sendKeys("MBPNNumber");
		
		//Completing the Repair Details task
		driver.findElement(By.xpath("(//button[@class='mat-focus-indicator body mat-raised-button mat-button-base primary-btn mat-primary ng-star-inserted'])[2]")).click();
	}
	
	
	//Checking the Repair Result task
	@Test
	public void MBRepair_RepairResult() throws InterruptedException {
		Thread.sleep(1000);
		//Getting the Defect Code path
		WebElement  Defect_Code =driver.findElement(By.xpath("(//button[@class='ngx-dropdown-button'])[2]"));
		//Initializing the Defect Code drop down
		Select objSelect = new Select(Defect_Code);
		objSelect.selectByIndex(1);
		
		
		//Getting the Action Code path
		  WebElement  Action_Code =driver.findElement(By.xpath("(//button[@class='ngx-dropdown-button'])[2]"));
		//Initializing the Defect Code drop down
		   Select objAction = new Select(Action_Code);
		   objAction.selectByIndex(1);
		
		
		 //Completing the Repair Result task
			driver.findElement(By.xpath("(//button[@class='mat-focus-indicator body mat-raised-button mat-button-base primary-btn mat-primary ng-star-inserted'])[3]")).click();
		
			Thread.sleep(5000);		
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
