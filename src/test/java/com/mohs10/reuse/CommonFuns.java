package com.mohs10.reuse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mohs10.ActionDriver.Action;
import com.mohs10.base.StartBrowser;
import com.mohs10.or.HomePage;

public class CommonFuns {

	public Action aDriver;
	public  WebDriver driver;

	public CommonFuns() {
		aDriver = new Action();
		driver = StartBrowser.driver;
	}

	/*
	 * public void browserInvoke() throws Exception { StartBrowser.childTest =
	 * StartBrowser.parentTest.createNode("login"); String str="test123"; byte[]
	 * encodedString=Base64.encodeBase64(str.getBytes());
	 * 
	 * }
	 */
public  void name() {
		
		
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		aDriver.name(HomePage.login, "test");
		driver.close();
		
	}
}