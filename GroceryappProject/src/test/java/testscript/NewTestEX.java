package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class NewTestEX extends Base{
  @Test
  @Parameters({"Username","Password"})
  public void verifyUserIsAbleToLoginUsingValidCredentials(String User,String Pass) throws IOException {

		// String usernameValue = ExcelUtility.getStringData(1, 0, "Login");
		// String passwordValue = ExcelUtility.getStringData(1, 1, "Login");

			LoginPage loginPage = new LoginPage(driver);
			loginPage.enterUsernameOnUsernmeField(User);
			loginPage.enterPasswordOnPasswordField(Pass);
			loginPage.clickOnSignInButton();
			boolean isHomePageLoaded = loginPage.dashBoardCheck();
			Assert.assertTrue(isHomePageLoaded, "unable to login the application");

  }
}
