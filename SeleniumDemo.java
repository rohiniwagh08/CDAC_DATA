package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDemo {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CDAC\\Desktop\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
//ChromeOptions co= new ChromeOptions();
//co.setBrowserVersion("120");

		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com");
		WebDriver d2 = new ChromeDriver();
		d2.get("https://www.gmail.com");  //2 browsers are open

		// d1.get("https://demo.guru99.com/v4");
		String s = d1.getTitle();
		System.out.println(s);  //getting the title

		String s1 = d1.getTitle();
		if (s1.equals("Google"))
			System.out.println("Pass");
		else
			System.out.println("Fail");  //checking the title is matched or not

		String s2 = d1.getCurrentUrl();  //getting the url of the browser
		System.out.println(s2);
//		String s3= d1.getPageSource();    //page source 
//		System.out.println(s3);
		
		d1.manage().window().maximize();   // to maximize the window for browser
		//d1.manage().window().minimize();  //to minimize 
		 Thread.sleep(5000);
		d1.close();            //Closing the browser

		//navigate method ...back page 
		WebDriver d3 = new ChromeDriver();
//		d3.get("https://www.google.com");
//		d3.get("https://www.gmail.com"); 
//		d3.navigate().back();
//		Thread.sleep(5000);
		//d3.navigate().forward();
		//d3.navigate().refresh();
		
		d3.navigate().to("https://www.amazon.com/");   //open a browser without get method
		
	}

}

//For chrome
