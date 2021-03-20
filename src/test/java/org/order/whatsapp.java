package org.order;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class whatsapp extends Password {
public static void main(String[] args)  {
	whatsapp wp=new whatsapp();
	WebDriverManager.chromedriver().setup();
	ChromeDriver d = new ChromeDriver();
	d.get("https://web.whatsapp.com/");
	Scanner s=new Scanner(System.in);
	s.nextInt();
	
	d.findElement(By.xpath("//div[@class='_2_1wd copyable-text selectable-text']")).sendKeys("yen Raththam"+Keys.ENTER);
	
	for (int i = 0; i <4; i++) {
	
	
	d.findElement(By.xpath("//div[@data-tab='6']")).sendKeys(wp.generator());
	d.findElement(By.xpath("//button[@class='_1E0Oz']")).click();
	//Thread.sleep(1000);
	
	}
	
	
	//d.findElement(By.xpath("//div[@class='_2pkLM']")).click();
}
}
