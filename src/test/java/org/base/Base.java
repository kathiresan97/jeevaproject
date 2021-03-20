package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Actions a;

	public static void launchBrowser(String Browser) {
		if (Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

	}

	public static void indSelect(WebElement element, int no) {
		Select si = new Select(element);
		si.selectByIndex(no);
	}

	public static void selectVisText(WebElement element, String text) {
		Select svt = new Select(element);
		svt.selectByVisibleText(text);

	}

	public static void selectVal(WebElement element, String text) {
		Select sv = new Select(element);
		sv.selectByValue(text);

	}

	public static void elementMove(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

}
