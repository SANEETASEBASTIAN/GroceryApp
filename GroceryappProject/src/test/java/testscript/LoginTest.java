package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
	@Test
	public void verifyUserIsAbleToLoginUsingValidCredentials() {
		String usernameValue = "admin";
		String passwordValue = "admin";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded, "unable to login the application");

	}
	@Test
	public void verifyUserIsAbleToLoginUsingValidUsernameandInvalidPassword() {
		String usernameValue = "admin";
		String passwordValue = "admin123";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean invalidData = loginPage.alertdisplayed();
		Assert.assertTrue(invalidData, "able to login the application");
		

	}
	@Test
	public void verifyUserIsAbleToLoginUsinginValidUsernameandvalidPassword() {
		String usernameValue = "admin12";
		String passwordValue = "admin";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean invalidData = loginPage.alertdisplayed();
		Assert.assertTrue(invalidData, "able to login the application");
		
		
		

	}
	
	@Test
	public void verifyUserIsAbleToLoginUsinginValidUsernameandInvalidPassword() {
		String usernameValue = "admin123";
		String passwordValue = "admin3444";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean invalidData = loginPage.alertdisplayed();
		Assert.assertTrue(invalidData, "able to login the application");
		
		

	}


}
