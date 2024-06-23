package com.CRM.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import com.CRM.Pages.*;

public class BaseClass {
	//Before Every test launching the application is common--hence put it in BaseClass
	
	
	
	public WebDriver driver;
	public HomePage hp;
	public LoginPage lp;
	
  @Test
  public void setUpBrowser() {
	  
	  driver=new EdgeDriver();
	  driver.get("https://automationplayground.com/crm/");
	   hp = new HomePage(driver);
	   lp=new LoginPage(driver);
  }
}
