package com.src.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOn {
	@FindBy(xpath="//a[contains(@href,'mercuryregister.php')]")
	public WebElement registerLink;
	@FindBy(name="userName")
	public WebElement userName;
	@FindBy(name="password")
	public WebElement password;
	@FindBy(name="login")
	public WebElement loginBtn;
	public void setUName(String uName){
		this.userName.sendKeys(uName);;
		
	}
	public void setPass(String pass){
		this.password.sendKeys(pass);
		
		
	}
public void loginBtnClick()
{
	this.loginBtn.click();
}
}


