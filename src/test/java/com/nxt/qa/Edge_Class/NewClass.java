package com.nxt.qa.Edge_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class NewClass {
	@Test
	public void TX() throws Exception {
		
		System.setProperty("webDriver.edge.driver", "C:\\WebDrivers\\Edge Driver");
		EdgeOptions W = new EdgeOptions();
		
		W.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
	}

}
