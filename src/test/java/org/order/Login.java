package org.order;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static WebDriver d;

	@Test
	private void tc1() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.wiggle.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PojoWiggle p=new PojoWiggle();
		p.getBtnYourAccount().click();
		p.getTxtEmail().sendKeys("jeeva@gmail.com");
		p.getTxtPass().sendKeys("123");
		p.getBtnSign().click();
	}

}
