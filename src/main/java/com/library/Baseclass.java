package com.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static WebDriver  driver;
	public void Browserlaunch() throws IOException {

		File f = new File("src/test/resources/configfolder/config.properties");

		FileInputStream input = new FileInputStream(f);

		Properties pro = new Properties();

		pro.load(input);

		

		 driver = new ChromeDriver();

		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();

	}

	
	
	public void closebrowser() {
		driver.close();
		
	}

}
