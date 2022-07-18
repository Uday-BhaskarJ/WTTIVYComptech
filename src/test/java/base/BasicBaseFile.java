package base;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicBaseFile {
	public static WebDriver driver;
	public static FileReader FileR;

	public static Properties prop = new Properties();

	@BeforeTest
	public void setUP() throws IOException {
		if (driver == null) {
			FileR = new FileReader(
					"C:\\Slenium Automation\\Automation - Maven\\WTTIvytech\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(FileR);

		}

		// Initiating the Chrome Driver
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		// Initiating the Edge Browser
		if (prop.getProperty("browser").equalsIgnoreCase("Edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			

		}

		// Initiating the FrieFox Browser

		if (prop.getProperty("browser").equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		

		driver.get(prop.getProperty("url")); // Getting the URL of the Website
		driver.manage().window().maximize();

	}

	@AfterTest
	public void teardown() {
		//driver.close();
	}

}
