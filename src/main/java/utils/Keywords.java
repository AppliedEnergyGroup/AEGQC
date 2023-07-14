package utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseClass;

public class Keywords extends BaseClass{
	
	public static void scrollToElement(WebElement element) throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(2000);
	}
	
	public static void verifyElement(WebElement element) {
		Assert.assertTrue(element.isDisplayed());
	}
	
	public static void verifyElementText(WebElement element, String text) {
		verifyElement(element);
		String actText=element.getText().trim();
		Assert.assertTrue(actText.equals(text));
	}
	
	public static void waitForElement(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void clickElement(WebElement element) {
		waitForElement(element);
		element.click();
	}
	
	public static void enterData(WebElement element,String data) {
		waitForElement(element);
		element.clear();
		element.sendKeys(data);
		
	}
	
	public static void moveToElement(WebElement element) throws InterruptedException {
		waitForElement(element);
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
		Thread.sleep(2000);
	}
	
	public static void jsClick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void selectDropdownOpt(WebElement element,String opt) {
		waitForElement(element);
		Select sel=new Select(element);
		sel.selectByVisibleText(opt);
	}
	
	public static String getSelectedOption(WebElement element) {
		waitForElement(element);
		Select sel=new Select(element);
		WebElement option=sel.getFirstSelectedOption();
		String optionText=option.getText();
		return optionText;
	}
	
	public static void selectFile(String fileName) throws AWTException, InterruptedException {
		String filePath=System.getProperty("user.dir")+"\\src\\main\\java\\resources\\"+fileName;
		Robot rb=new Robot();
		StringSelection str=new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		

			
	
	}
	
	

}
