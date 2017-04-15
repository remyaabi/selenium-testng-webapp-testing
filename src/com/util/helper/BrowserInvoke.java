package com.util.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class BrowserInvoke {
	static WebDriver driver;
	
	public static  WebDriver setup(String browserName,String baseURL) {
		if (driver == null) {
		if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\work\\github-projects\\selenium-testng-webapp-testing\\drivers\\gecko\\geckodriver_1.exe");
			DesiredCapabilities capabilities=DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			   driver = new FirefoxDriver(capabilities);	  
			   
		}else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver","C:\\work\\github-projects\\selenium-testng-webapp-testing\\drivers\\ie\\IEDriverServer.exe");

	         driver = new InternetExplorerDriver();
		}else if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\work\\github-projects\\selenium-testng-webapp-testing\\drivers\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		}
		return driver;	
	  }
	

}
