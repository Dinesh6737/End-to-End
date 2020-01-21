package org.resources;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.step.Hooks;

public class BaseClass {
	public void launch(String url) {
		Hooks.driver.get(url);
	}
	public void type(WebElement w,String s) {
		w.sendKeys(s);
	}
	public void press(WebElement w) {
		w.click();
	}
	public void scroll(WebElement w) {
		JavascriptExecutor j = (JavascriptExecutor)Hooks.driver;
		j.executeScript("arguments[0].scrollIntoView(true)", w);
	}
	public void screenShot(String path) throws IOException {
		TakesScreenshot t = (TakesScreenshot)Hooks.driver;
		File src =t.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src, des);
	}
	

}
