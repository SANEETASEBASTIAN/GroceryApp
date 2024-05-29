package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;




public class WaitUtility {
	public static final long EXPLICIT_WAIT = 20;
	public void waitForElement(WebDriver driver, WebElement target) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.visibilityOf(target));
		
	}
	public void waitForElementClick(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
	    wait.until(ExpectedConditions.elementToBeClickable(element));
		}
	public void fluentWaitForElementToBeClickable(WebDriver driver,WebElement element)

	{

		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)

		        .withTimeout(Duration.ofSeconds(10))

		        .pollingEvery(Duration.ofSeconds(20))

		        .ignoring(NoSuchElementException.class);

		fluentWait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public void fluentWaitForAlertIsPresent(WebDriver driver)

	{

		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)

		        .withTimeout(Duration.ofSeconds(10))

		        .pollingEvery(Duration.ofSeconds(20))

		        .ignoring(NoSuchElementException.class);

		fluentWait.until(ExpectedConditions.alertIsPresent());

	}

	public void fluentWaitForVisibilityOfElementLocated(WebDriver driver,By target)

	{

		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)

		        .withTimeout(Duration.ofSeconds(20))

		        .pollingEvery(Duration.ofSeconds(10))

		        .ignoring(NoSuchElementException.class);

		fluentWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(target));

	}

	public void fluentWaitForVisibilityOfElement(WebDriver driver,WebElement target)

	{

		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)

		        .withTimeout(Duration.ofSeconds(20))

		        .pollingEvery(Duration.ofSeconds(10))

		        .ignoring(NoSuchElementException.class);

		fluentWait.until(ExpectedConditions.visibilityOf(target));

	}
}
