package com.CRM.TestCases;

import org.testng.annotations.Test;

import org.testng.Assert;


public class HomePageTest extends BaseClass {
  @Test(priority=1)
  public void validateURL() {
	  
	  String actUrl=hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"),"Test Case FAILED ! URL matrched");
	  System.out.println("Test Case PASSED ! URL matrched ");   
  }
  
  @Test(priority=2)
  public void validateTitle() {
	  
	  String actTitle=hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Customer Service"),"Test Case FAILED ! Title matrched");
	  System.out.println("Test Case PASSED ! Title matrched ");
  }
  
  @Test(priority=3)
  public void validateSignIn() {
	  
	  String actUrl=hp.getSignIn();
	  Assert.assertTrue(actUrl.contains("Login"),"Test Case FAILED !");
	  System.out.println("Test Case PASSED - User Navigated  Sucessfully ");
  }
}
