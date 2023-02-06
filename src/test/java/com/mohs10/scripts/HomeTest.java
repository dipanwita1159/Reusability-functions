package com.mohs10.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

public class HomeTest extends StartBrowser {
	@Test (priority=0) 
	 public void browserInvoke() throws Exception { WebDriver
	  driver=StartBrowser.beforeClass("chrome", "https://demowebshop.tricentis.com/login"); CommonFuns
	  veri = new CommonFuns(); 
	  veri.name();
		
	  Thread.sleep(10000); 
	  driver.close();}}
