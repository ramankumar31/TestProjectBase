package com.crm.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginPageTest  extends Testbase {
	LoginPage loginpage;
	HomePage Homepage;
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeTest
	public void setup() throws IOException
	{
		initialization();
		 loginpage= new LoginPage(Testbase.driver);
			
	}
	
	@Test
	public void logintest() throws InterruptedException
	{
		//Homepage=	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		//		Homepage=	loginpage.login();
		LoginPage.login(Testbase.driver);
	}
	
}
