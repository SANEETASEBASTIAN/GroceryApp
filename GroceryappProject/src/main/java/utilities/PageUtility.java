package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	WebDriver driver;

	public void selection(WebElement element, String elementtext) {
		Select select = new Select(element);
		select.selectByVisibleText(elementtext);

	}
	public void selection2(WebElement element1, String elementtext1) {
		Select select = new Select(element1);
		select.selectByIndex(0);

	}
	public void selection3(WebElement element3, String elementtext3) {
		Select select = new Select(element3);
		select.selectByValue(elementtext3);

	}

	public void actions(WebElement elementname, WebElement destination) {
		Actions actions = new Actions(driver);
		actions.moveToElement(elementname).click();
		actions.doubleClick().click();
		actions.contextClick().click();
		actions.dragAndDrop(elementname, destination).build().perform();
	}

	public void javascriptExecutor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		js.executeScript("window.scrollBy(0,-550)", "");

	}
	public void fileuploadUsingRobertClass(WebElement element,String path) throws AWTException {
		
		StringSelection ss = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
		
	

}
