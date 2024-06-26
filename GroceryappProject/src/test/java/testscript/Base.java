package testscript;

import org.testng.annotations.Test;

import constants.Constants;
import utilities.ScreenShotUtility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Base {

	WebDriver driver;

	@Test
	@BeforeMethod
	@Parameters("browser")
	public void initializeMethod(String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			throw new Exception("invalid browser");
		}

		// driver = new ChromeDriver();
		// driver=new EdgeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void afterMethod(ITestResult itResult) throws IOException {
		if (itResult.getStatus() == ITestResult.FAILURE) {
			ScreenShotUtility sc = new ScreenShotUtility();
			sc.captureFailureScreenShot(driver, itResult.getName());
		}
		driver.close();
}

}
