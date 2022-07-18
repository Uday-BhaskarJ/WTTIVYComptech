package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BasicBaseFile;

public class ClientSelect extends BasicBaseFile {
	@Test(priority = 1, description = "selection of Location as Bydgoszcz")
	public static void Location() throws InterruptedException {
		if (prop.getProperty("Client").equalsIgnoreCase("HP")) {
			Thread.sleep(10000);
			WebElement Loc_Ddown = driver.findElement(By.xpath(
					"/html/body/app-root/app-base/app-side-nav/mat-drawer-container/mat-drawer[1]/div/div/footer/app-dropdown[1]/div/select"));

			Select Loc_Select = new Select(Loc_Ddown);
			Loc_Select.selectByVisibleText("Bydgoszcz");
			Thread.sleep(2000);

		}

	}

	// CLient Drop down selection
	@Test(priority = 2, description = "selection of Client as HP")
	public static void Client() throws InterruptedException {
		if (prop.getProperty("Client").equalsIgnoreCase("HP")) {
			WebElement Client_Ddown = driver.findElement(By.xpath(
					"/html/body/app-root/app-base/app-side-nav/mat-drawer-container/mat-drawer[1]/div/div/footer/app-dropdown[2]/div/select"));

			Select CLient_Select = new Select(Client_Ddown);
			CLient_Select.selectByVisibleText("HP");
			Thread.sleep(2000);

		}

	}

	@Test(priority = 3, description = "selection of Operation as WC OPERATION")
	public static void Openratiom() {
		if (prop.getProperty("Client").equalsIgnoreCase("HP")) {
			WebElement Ope_Ddown = driver.findElement(By.xpath(
					"/html/body/app-root/app-base/app-side-nav/mat-drawer-container/mat-drawer[1]/div/div/footer/app-dropdown[3]/div/select"));

			Select Ope_Select = new Select(Ope_Ddown);
			Ope_Select.selectByVisibleText("COMMERCIAL");

		}

	}

}
