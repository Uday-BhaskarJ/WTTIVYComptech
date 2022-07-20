package testcases;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.BasicBaseFile;

public class IvyLogin extends BasicBaseFile{
	
	private static Logger WttLogger= LogManager.getLogger(IvyLogin.class.getClass());
			
			
	public void Login() throws InterruptedException
	{
				
		Thread.sleep(4000);
		//System.out.println(prop.getProperty("UserName"));
		
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("UserName"));
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("Password"));
		
		driver.findElement(By.xpath("/html/body/app-root/app-base/app-form-panel/div/mat-card/mat-card-actions/app-button/div/button")).click();
		WttLogger.info("Login is sucessfull");
		
	}

	//Business Method
	@Test(description="Login to IvyTech Application")
	public void LoginApp() throws InterruptedException {
		Login();
		
	}
	
	
	
}


