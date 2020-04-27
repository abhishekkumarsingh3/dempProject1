package com.AtomationTalks.dempProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {


	
	public static WebDriver driver;
	
	@BeforeTest
	public void launchDriver()
	{
		System.setProperty("webdriver.chrome.deiver", "C:\\Users\\Abhishek_Singh33\\eclipse-workspace\\dempProject1\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	
	}
	
	@Test
	public void test1()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("test title is "+driver.getTitle());
	}
	@Test
	public void test2()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("test title is "+driver.getTitle());
	}
	@Test
	public void test3()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("test title is "+driver.getTitle());
	}
	@AfterTest
	public void quit()
	{
		driver.close();
	}
	

}
