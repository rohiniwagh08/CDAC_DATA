package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemo {

	public static void main(String[] args) {
		// https://demo.guru99.com/test/drag_drop.html

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CDAC\\Desktop\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver obj = new ChromeDriver();
		obj.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement drag = obj.findElement(By.xpath(
				"//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
		//for 5000
		WebElement drop = obj.findElement(By.xpath("//ol[@id='amt7']"));
		Actions act = new Actions(obj);
		act.dragAndDrop(drag, drop).build().perform();
		
		//For amount
		WebElement drag1= obj.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement drop1= obj.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
		act.dragAndDrop(drag1, drop1).build().perform();
		
		//For sales
		WebElement drag2= obj.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		WebElement drop2= obj.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
		act.dragAndDrop(drag2, drop2).build().perform();
	}

}
