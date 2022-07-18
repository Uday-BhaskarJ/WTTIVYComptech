package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BasicBaseFile;

public class ScreenTitle extends BasicBaseFile {
	public static String screen_Name;

	@Test
	public static void screen_title() {

		screen_Name = driver.findElement(By.xpath(
				"/html/body/app-root/app-base/app-sub-process/mat-drawer-container/mat-drawer-content/div/app-page/header/app-toolbar/mat-toolbar/mat-toolbar-row/app-title"))
				.getText();

		if (screen_Name.equalsIgnoreCase("Burn-In")) {

		}

		else {
			System.out.println("Page is not yet loaded");

		}

	}

}
