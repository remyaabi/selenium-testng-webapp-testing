package com.util.helper;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.RETURN;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class BrowserInvoke {
	static WebDriver driver;
	
	public static  WebDriver setup(String browserName,String baseURL) {
		if (driver == null) {
		if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.marionette", "C:\\InstallationFiles\\Gecko\\geckodriver_1");
			   driver = new FirefoxDriver();	  
			   
		}else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver","C:\\InstalledApps\\IEDriver\\IEDriverServer.exe");

	         driver = new InternetExplorerDriver();
		}else if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\InstalledApps\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		}
		return driver;	
	  }
	

}
