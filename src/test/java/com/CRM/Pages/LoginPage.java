package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	//initialize the driver
	public LoginPage(WebDriver driver){
		this.driver=driver;	
	}
	// locTORS
	private By email=By.id("email-id");
	private By pwd =By.id("password");
    private By btn=By.id("submit-id");
    
    public String doLogin(String em,String ps) {
    	driver.findElement(email).sendKeys(em);
    	driver.findElement(pwd).sendKeys(ps);
    	driver.findElement(btn).click();
    	return driver.getCurrentUrl();
    	
    	
    
    }
}
