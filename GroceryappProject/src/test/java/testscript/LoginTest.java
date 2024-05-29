package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@DataProvider(name = "Credentials")
/*	public Object[][] testData() {// data provider
		Object[][] input = new Object[2][2];
		input[0][0] = "admin";
		input[0][1] = "admin";
		input[1][0] = "admin@123";
		input[1][1] = "admin123";
		return input;

	}*/

	@Test(groups= {"smoke"})//(dataProvider = "Credentials")
	@Parameters//({"Username","Password"})
	public void verifyUserIsAbleToLoginUsingValidCredentials(/*String username,String password*/) throws IOException {

	 String usernameValue = ExcelUtility.getStringData(1, 0, "Login");
	String passwordValue = ExcelUtility.getStringData(1, 1, "Login");

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded, "unable to login the application");

	}

	@Test(description = "verify the user able login valid username and invalid password")
	public void verifyUserIsAbleToLoginUsingValidUsernameandInvalidPassword() throws IOException {
		String usernameValue = ExcelUtility.getStringData(1, 0, "Login");
		String passwordValue = ExcelUtility.getStringData(1, 3, "Login");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean invalidData = loginPage.alertdisplayed();
		Assert.assertTrue(invalidData, "able to login the application");

	}

	@Test(groups={"smoke"})
	public void verifyUserIsAbleToLoginUsinginValidUsernameandvalidPassword() throws IOException {
		String usernameValue = ExcelUtility.getStringData(1, 2, "Login");
		String passwordValue = ExcelUtility.getStringData(1, 1, "Login");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean invalidData = loginPage.alertdisplayed();
		Assert.assertTrue(invalidData, "able to login the application");

	}

	@Test
	public void verifyUserIsAbleToLoginUsinginValidUsernameandInvalidPassword() throws IOException {

		LoginPage loginPage = new LoginPage(driver);
		String usernameValue = ExcelUtility.getStringData(1, 2, "Login");
		String passwordValue = ExcelUtility.getStringData(1, 3, "Login");
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean invalidData = loginPage.alertdisplayed();
		Assert.assertTrue(invalidData, "able to login the application");

	}

}
