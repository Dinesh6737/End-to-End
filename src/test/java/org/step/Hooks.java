package org.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Dinesh\\EndtoendFaballey\\Driver up\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@After
	public void closeBrowser() {
		System.out.println("Quit");
	}

}
