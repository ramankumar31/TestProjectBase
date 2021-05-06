package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	
	//public	static	WebDriver driver;
	public static WebDriver driver;
	public	static Properties prop;
	public Testbase() throws IOException
	{
			try {
		prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\raman\\JAVAPROJECT\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		prop.load(ip);
		 } catch(IOException ie) {
	            ie.printStackTrace();
	        } 
		
	}
	
	public static  void initialization()
	{
	
//	String url1=prop.getProperty("url");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.get("http://automationpractice.com/index.php");
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();

		
	}

}
