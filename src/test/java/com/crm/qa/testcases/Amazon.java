package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class Amazon extends TestBase{

	
	
	Amazon amazon;
	HomePage homePage;
	
	public Amazon(){
		super();
	}
	
	public void setUp(){
		initialization();
		amazon = new Amazon();	
	}
}
