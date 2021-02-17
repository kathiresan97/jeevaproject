package org.order;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CycleOrder {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver d = new ChromeDriver();
	d.get("https://www.wiggle.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	d.findElement(By.id("rs")).sendKeys("cycle");
	d.findElement(By.xpath("//button[@type='submit']")).click();
	d.findElement(By.xpath("(//div[@class='bem-product-thumb--grid'])[1]")).click();
	WebElement dpdnCycleSize = d.findElement(By.xpath("(//a[@class='bem-sku-selector__option-prompt'])[1]"));
	dpdnCycleSize.click();
	
	
	d.findElement(By.xpath("//li[@title='Dark Teal']")).click();
	
	d.findElement(By.xpath("(//a[@class='bem-sku-selector__option-prompt'])[3]")).click();
	d.findElement(By.xpath("//div[contains(text(),'Hurry - 1 In stock, ready for despatch now')]")).click();
//	Thread.sleep(2000);
//	Select s=new Select(dpdnCycleSize);
//	s.selectByIndex(1);
	
	d.findElement(By.xpath("//button[text()='Add to Basket']")).click();
	Thread.sleep(2000);
	d.findElement(By.id("checkoutnow")).click();
}
}
