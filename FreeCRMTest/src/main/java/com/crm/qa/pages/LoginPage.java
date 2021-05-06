package com.crm.qa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends Testbase  {
	//public	static	WebDriver driver;
	
	//WebDriver driver;
	
	public LoginPage(WebDriver mainDriver) throws IOException{
		this.driver=mainDriver;
		PageFactory.initElements(driver,this);
		}
//	static WebDriver driver=null;
//	public LoginPage(WebDriver mainDriver) throws IOException{
//	LoginPage.driver=mainDriver;
//	PageFactory.initElements(driver,this);
//	}
	
//	public LoginPage() throws IOException{
//		
//		PageFactory.initElements(Testbase.driver, this);
//		
//		//this.driver = ;
//		}
	
	
	//public HomePage login(String un, String pwd) throws InterruptedException {
	//	public HomePage login() throws InterruptedException {
//			public static  void login1(WebDriver driver) throws InterruptedException {
//				
//////				if(driver==null)
//////				 {
//////		            
//////	                WebDriverManager.chromedriver().setup();
//////	                driver = new ChromeDriver();
//////	                
//////				 }
//		driver.findElement(By.id("email")).sendKeys("ramankumar31@gmail.com");
//		driver.findElement(By.id("passwd")).sendKeys("ramankumar31");
//
//		driver.findElement(By.id("SubmitLogin")).click();
//
//		
//		
//	}
			//Page Factory- OB
			@FindBy(id="email")
			public  WebElement email;
			
			//passwd
			@FindBy(id="passwd")
			public WebElement passwd;
			
			@FindBy(id="SubmitLogin")
			public WebElement btnlogin;
			
			@FindBy(xpath="//a[contains(text(),'Sign in']")
			public WebElement SignIN;
			public String validateloginpageTitle()
			{	
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				return driver.getTitle();
						//System.out.println(driver.getTitle());
			}
//			email.sendKeys("ramankumar31@gmail.com");
//			passwd.sendKeys("ramankumar31");
//			email.sendKeys(un);
//			passwd.sendKeys(pwd);

			
			public static void login(WebDriver driver) {
				// TODO Auto-generated method stub
				driver.findElement(By.id("email")).sendKeys("ramankumar31@gmail.com");
				driver.findElement(By.id("passwd")).sendKeys("ramankumar31");
		//
				driver.findElement(By.id("SubmitLogin")).click();
			}
}
