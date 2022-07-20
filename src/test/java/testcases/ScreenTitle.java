package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BasicBaseFile;

public class ScreenTitle extends BasicBaseFile {
	public String screen_Name;
	
	@Test(priority = 1, description = "Getting the screen Name")
	public void screen_title() throws InterruptedException {

		Thread.sleep(8000);
		
		if(prop.getProperty("Client").equalsIgnoreCase("HP")) {
		screen_Name = driver.findElement(By.xpath("//*[@id=\"undefined\"]/mat-toolbar-row/app-title/p/span")).getText();
		
		if (screen_Name.equalsIgnoreCase("Burn-In")) {
		}

		else {
			System.out.println(screen_Name +"Page is not yet loaded");

		}

	}

}
}
