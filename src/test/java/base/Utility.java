package base;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Utility {
	//Screenshot, alerts,frames,windows,sync issue
	
	public static void captureScreenshot(WebDriver driver, String screenshotName) {
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("./screenshots/"+screenshotName+".png"));
			System.out.println("Screenshot taken");
			
		}
		catch(Exception e){
			System.out.println("Exception while taking screenshot"+e.getMessage());
			
		}
	}
}
		
	
