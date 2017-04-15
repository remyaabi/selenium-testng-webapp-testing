package com.src.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnderConstObject {
	WebDriver driver;
	@FindBy(xpath="(//a[@href='mercurywelcome.php'])[2]")
	    public WebElement backBtn;
	/*public void setWebDriver(WebDriver driver2) {
		driver = driver2;
	}*/
	public void backBtnclick(){
		if(backBtn.isDisplayed()){
			backBtn.click();
		}
	}

}
