package com.src.pageobject;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class HomePageObject {
	 String homeTitle="Welcome: Mercury Tours";
	 String constructionTitle="Under Construction: Mercury Tours";
	String cursieTitle="Cruises: Mercury Tours";
	 String registerTitle="Register: Mercury Tours";
	
	
	WebDriver driver;
	
	@FindBy(linkText ="Flights")
    public WebElement flightLink;

	@FindBy(linkText ="Home")
	public WebElement homeLink;	 

	@FindBy(linkText ="Cruises")
	public WebElement cruisLink;	

	@FindBy(linkText = "Hotels")
	public WebElement hotelLink;

	@FindBy(linkText = "Car Rentals")
	public WebElement carRentLink;	
	
	@FindBy(linkText = "Destinations")
	public WebElement destinationLink;

	@FindBy(linkText = "Vacations")
	public WebElement vacationLink;

	@FindBy(linkText = "SUPPORT")
	public WebElement supportLink;	
	
	@FindBy(name = "userName")
	public WebElement userName;	
	
	@FindBy(name = "password")
	public WebElement password;	
	
	@FindBy(name = "login")
	public WebElement loginBtn;	
	
	@FindBy(xpath = "(//tr[@class='mouseOut'])[1]")
	public WebElement homeBackgrnd;
	
	@FindBy(linkText ="REGISTER")
    public WebElement registerLink;
	
	
	//public void HomePageObject();
	
	public void verifylogin(String user, String pass){
		userName.sendKeys(user);
		password.sendKeys(pass);
		loginBtn.click();
			
	}
	public void homeLinkclick(){
		homeLink.click();
		 if(!(driver.getTitle().equalsIgnoreCase(homeTitle))){
		    	File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	  try {	   	    
		 	    	 FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot_" + System.currentTimeMillis() + ".png"));	 	  
		 	      } catch (IOException e) {
		 	          // TODO Auto-generated catch block
		 	          e.printStackTrace();  
		 	          }
		 	    }
	}
	
	public void flightLinkclick(){
		homeLink.click();
		 if(!(driver.getTitle().equalsIgnoreCase(homeTitle))){
		    	File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	  try {	   	    
		 	    	 FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot_" + System.currentTimeMillis() + ".png"));	 	  
		 	      } catch (IOException e) {
		 	          // TODO Auto-generated catch block
		 	          e.printStackTrace();  
		 	          }
		 	    }
	}
		 public void cruisesLinkclick(){
			 cruisLink.click();	
			 if(!(driver.getTitle().equalsIgnoreCase(cursieTitle))){
				 File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 try {	   	    
					 FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot_" + System.currentTimeMillis() + ".png"));	 	  
				 } catch (IOException e) {
					 // TODO Auto-generated catch block
					 e.printStackTrace(); }
 	    }
		 }
		 public void hotelsLinkclick(){
			 hotelLink.click();
			 if(!(driver.getTitle().equalsIgnoreCase(constructionTitle))){
			    	File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    	  try {	   	    
			 	    	 FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot_" + System.currentTimeMillis() + ".png"));	 	  
			 	      } catch (IOException e) {
			 	          // TODO Auto-generated catch block
			 	          e.printStackTrace(); 
			 	          }
			 }
		 }
			 public void carRentLinkclick(){
				 carRentLink.click();
				 if(!(driver.getTitle().equalsIgnoreCase(constructionTitle))){
				    	File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				    	  try {	   	    
				 	    	 FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot_" + System.currentTimeMillis() + ".png"));	 	  
				 	      } catch (IOException e) {
				 	          // TODO Auto-generated catch block
				 	          e.printStackTrace(); 
				 	          }
				 } 
				 
				 
			 }
			 
			 public void destinationLinkclick(){
				 destinationLink.click();
				 if(!(driver.getTitle().equalsIgnoreCase(constructionTitle))){
				    	File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				    	  try {	   	    
				 	    	 FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot_" + System.currentTimeMillis() + ".png"));	 	  
				 	      } catch (IOException e) {
				 	          // TODO Auto-generated catch block
				 	          e.printStackTrace(); 
				 	          }
				 } 
				 
				 
			 }
			 public void vacationLinkclick(){
				 vacationLink.click();
				 if(!(driver.getTitle().equalsIgnoreCase(constructionTitle))){
				    	File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				    	  try {	   	    
				 	    	 FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot_" + System.currentTimeMillis() + ".png"));	 	  
				 	      } catch (IOException e) {
				 	          // TODO Auto-generated catch block
				 	          e.printStackTrace(); 
				 	          }
				 } 
				 
				 
			 }
			 public void registerLinkclick(){
				 registerLink.click();
				 if(!(driver.getTitle().equalsIgnoreCase(registerTitle))){
				    	File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				    	  try {	   	    
				 	    	 FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot_" + System.currentTimeMillis() + ".png"));	 	  
				 	      } catch (IOException e) {
				 	          // TODO Auto-generated catch block
				 	          e.printStackTrace(); 
				 	          }
				 } 
				 
				 
			 }
			 
			 
			 
			 public void colorCheck(WebElement toElement){
				 
				 System.out.println("Entered colorcheck");
				 Actions mouseHover=new Actions(driver);
				 System.out.println("Entered colorcheck action");
				String bgcolorLinkBefore= homeBackgrnd.getCssValue("background-color");
				System.out.println("css backgroung color"+ bgcolorLinkBefore);
			
			    mouseHover.moveToElement(toElement).build().perform();
			    String bgcolorLinkAfter= homeBackgrnd.getCssValue("background-color");
				System.out.println("css backgroung color"+ bgcolorLinkAfter);
				// if(bgcolorLink.equalsIgnoreCase())
				 
				 
			 }
			public void setWebDriver(WebDriver driver2) {
				driver = driver2;
			}
}

