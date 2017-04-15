package com.src.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPageObject {
	@FindBy(name = "firstName")
	public WebElement firstName;	
	@FindBy(name = "phone")
	public WebElement phone;	
	@FindBy(id = "userName")
	public WebElement userName;	
	@FindBy(name = "address1")
	public WebElement address1;	
	@FindBy(name = "city")
	public WebElement city;	
	@FindBy(name = "state")
	public WebElement state;
	@FindBy(name = "postalCode")
	public WebElement postalCode;
	@FindBy(name = "country")
	public WebElement countrySelect;
	@FindBy(id = "email")
	public WebElement email;
	@FindBy(name = "password")
	public WebElement password;
	@FindBy(name = "confirmPassword")
	public WebElement confirmPassword;
	@FindBy(name = "register")
	public WebElement register;
	@FindBy(name = "lastName")
	public WebElement lastName;
	
	public void setFirstName(String fName){
		firstName.sendKeys(fName);
		
	}
	public void setLastName(String lName){
		lastName.sendKeys(lName);
		
	}
	public void setUserame(String uName){
		userName.sendKeys(uName);
		
	}
	public void setPassword(String pass){
		password.sendKeys(pass);
		
	}
	public void setConPass(String conPass){
		confirmPassword.sendKeys(conPass);
		
	}
	public void setaddress(String address){
		address1.sendKeys(address);
		
	}
	public void setCity(String city){
		this.city.sendKeys(city);
		
	}
	public void setEmail(String email){
		this.email.sendKeys(email);
		
	}
	public void setState(String state){
		this.state.sendKeys(state);
		
	}
	public void setPhone(String phone){
		this.phone.sendKeys(phone);
		
	}
	public void setZipCode(String zipcode){
		this.postalCode.sendKeys(zipcode);
		
	}
	public void registerClick(){
		register.click();
		
	}
	
}
