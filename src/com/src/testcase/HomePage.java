package com.src.testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.src.pageobject.HomePageObject;
import com.src.pageobject.UnderConstObject;
import com.util.helper.BrowserInvoke;
import com.src.pageobject.RegisterPageObject;
import com.src.pageobject.SignOn;


public class HomePage {
	
	String baseURL="http://newtours.demoaut.com/";
	String browserName="chrome";
	@Test
	public void loginCheck(){
		String user="remyaabi@gmail.com";
		String pass="totest1";
		WebDriver driver=BrowserInvoke.setup(browserName,baseURL);
		HomePageObject homePageObject = PageFactory.initElements(driver, HomePageObject.class);
		UnderConstObject underConstObject = PageFactory.initElements(driver, UnderConstObject.class);
		homePageObject.setWebDriver(driver);
		System.out.println("Browser Invoked");
		homePageObject.homeLinkclick();
		System.out.println("homepage loaded");
		//underConstObject.backBtnclick();
		homePageObject.flightLinkclick();
		System.out.println("flight loaded");
		//underConstObject.backBtnclick();
		homePageObject.cruisesLinkclick();
		System.out.println("cruise loaded");
		//underConstObject.backBtnclick();
		homePageObject.carRentLinkclick();
		System.out.println("carrent loaded");
		underConstObject.backBtnclick();
		homePageObject.destinationLinkclick();
		System.out.println("destination loaded");
		underConstObject.backBtnclick();
		homePageObject.vacationLinkclick();
		System.out.println("vacation loaded");
		underConstObject.backBtnclick();
		homePageObject.verifylogin(user,pass);
		System.out.println("user login loaded");
		System.out.println("Calling colorcheck");
		driver.navigate().back();
		
		
	}
	@Test
	public void linkBackGroudColorCheck(){
		WebDriver driver=BrowserInvoke.setup(browserName,baseURL);
		HomePageObject homePageObject = PageFactory.initElements(driver, HomePageObject.class);
		homePageObject.setWebDriver(driver);
		System.out.println("Calling colorcheck");
		homePageObject.colorCheck(homePageObject.cruisLink);		
		
	}
	@Test
	public void registerUser(){
		
		WebDriver driver=BrowserInvoke.setup(browserName,baseURL);
		RegisterPageObject registerPageObject = (RegisterPageObject) PageFactory.initElements(driver, RegisterPageObject.class);
		HomePageObject homePageObject = (HomePageObject) PageFactory.initElements(driver, HomePageObject.class);
		homePageObject.registerLink.click();
		 WebDriverWait d= new WebDriverWait(driver,7);
		 d.until(ExpectedConditions.elementToBeClickable(registerPageObject.firstName));
		
		registerPageObject.setFirstName("Elaine");
		registerPageObject.setLastName("Varghese");
		registerPageObject.setPhone("6786787897");
		registerPageObject.setEmail("elaine@gmail.com");
		registerPageObject.setaddress("ne 148th portland wa");
		registerPageObject.setCity("snowqualime");
		registerPageObject.setState("California");
		registerPageObject.setZipCode("8739857438");
		Select countrySelectEle=new Select(registerPageObject.countrySelect);
		List<WebElement>countryList=countrySelectEle.getOptions();
		for(WebElement oneCountry:countryList){
			if(oneCountry.getText().equalsIgnoreCase("UNITED KINGDOM")){
				countrySelectEle.selectByVisibleText(oneCountry.getText());
			}
		}
		registerPageObject.setUserame("Elaine");
		registerPageObject.setPassword("totest2");
		registerPageObject.setConPass("totest2");
		registerPageObject.registerClick();
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}
	@Test
public void loginUser(){
		
		WebDriver driver=BrowserInvoke.setup(browserName,baseURL);
		SignOn signOnPageObject = (SignOn) PageFactory.initElements(driver, SignOn.class);
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		signOnPageObject.setUName("Elaine");
		signOnPageObject.setPass("totest2");
		signOnPageObject.loginBtnClick();
	
}
	@Test
public void registerLinkClick(){
	
	WebDriver driver=BrowserInvoke.setup(browserName,baseURL);
	driver.get("http://newtours.demoaut.com/mercurysignon.php");
	SignOn signOnPageObject = (SignOn) PageFactory.initElements(driver, SignOn.class);	
	signOnPageObject.registerLink.click();

}
}

