package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	//Page class includes Identification(locators) + Actions
	//Encapsulation+methods
	//

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
		
	}
	
	//locators
	
	By link=By.linkText("Sign In");
	
	//method
	
	public String getAppTitle() {
		return driver.getTitle();
		
	}
	
	public String getAppUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getSignIn() {
		driver.findElement(link).click();
		return driver.getCurrentUrl();
	}
	
}
