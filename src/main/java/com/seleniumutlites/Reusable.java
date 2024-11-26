package com.seleniumutlites;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.library.Baseclass;

public class Reusable extends Baseclass {
	public void toClick(WebElement element) {

		element.click();
	}

	public void enterValue(WebElement ele, String Value) {

		ele.sendKeys(Value);

	}

	public void toScrollDown(WebElement elemnt) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", elemnt);

	}

	public void mouseactionclass(WebElement elemnt,int x,int y) {
		Actions a = new Actions(driver);
		a.dragAndDropBy(elemnt, x, y).build().perform();
	}

	public void robotclassright() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
	}

	public void robotclassbackspace() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
	}

}
