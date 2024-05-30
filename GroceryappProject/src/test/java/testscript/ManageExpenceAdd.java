package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageExpencePage;
import utilities.ExcelUtility;

public class ManageExpenceAdd extends Base {
	@Test
	public void addNewTitleToManageExpence() throws IOException {

		String usernameValue = ExcelUtility.getStringData(1, 0, "Login");
		String passwordValue = ExcelUtility.getStringData(1, 1, "Login");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded,Constants.ERRORMESSAGEFORUNABLETOLOGIN);

		ManageExpencePage manageExpencePage = new ManageExpencePage(driver);
		String title = ExcelUtility.getStringData(1, 0,"ManageExpence");
		manageExpencePage.clickManageExpence();
		manageExpencePage.clickExpenceCategory();
		manageExpencePage.clickNew();
		manageExpencePage.EnterTitle(title);
		manageExpencePage.clickingSaveButton();

		boolean isMessageDispalyedAfterCreatingExpence = manageExpencePage.alertMessageByCreatingNewExpence();
		Assert.assertTrue(isMessageDispalyedAfterCreatingExpence, "Not created");

	}

	@Test
	public void newTitleAlreadyExists() throws IOException {
		String usernameValue = ExcelUtility.getStringData(1, 0, "Login");
		String passwordValue = ExcelUtility.getStringData(1, 1, "Login");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded, "unable to login the application");

		ManageExpencePage manageExpencePage = new ManageExpencePage(driver);
		String title = ExcelUtility.getStringData(1, 0, "ManageExpence");
		manageExpencePage.clickManageExpence();
		manageExpencePage.clickExpenceCategory();
		manageExpencePage.clickNew();
		manageExpencePage.EnterTitle(title);
		manageExpencePage.clickingSaveButton();

		boolean isMessageDispalyedAlreadyExists = manageExpencePage.alertMessageAlreadyExists();
		Assert.assertTrue(isMessageDispalyedAlreadyExists, "Not created");
	}
}
