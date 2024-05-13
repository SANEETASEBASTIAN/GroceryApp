package testscript;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageExpencePage;

public class ManageExpenceAdd extends Base {
	@Test
	public void addNewTitleToManageExpence() {
		String usernameValue = "admin";
		String passwordValue = "admin";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded, "unable to login the application");

		ManageExpencePage manageExpencePage = new ManageExpencePage(driver);
		manageExpencePage.clickManageExpence();
		manageExpencePage.clickExpenceCategory();
		manageExpencePage.clickNew();
		manageExpencePage.EnterTitle();
		manageExpencePage.clickingSaveButton();
	
		boolean isMessageDispalyedAfterCreatingExpence=manageExpencePage.alertMessageByCreatingNewExpence();	
		Assert.assertTrue(isMessageDispalyedAfterCreatingExpence,"Not created");
		
	}
	@Test
	public void newTitleAlreadyExists() {
		String usernameValue = "admin";
		String passwordValue = "admin";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded, "unable to login the application");

		ManageExpencePage manageExpencePage = new ManageExpencePage(driver);
		manageExpencePage.clickManageExpence();
		manageExpencePage.clickExpenceCategory();
		manageExpencePage.clickNew();
		manageExpencePage.EnterTitle();
		manageExpencePage.clickingSaveButton();
	
		boolean isMessageDispalyedAlreadyExists=manageExpencePage.alertMessageAlreadyExists();	
		Assert.assertTrue(isMessageDispalyedAlreadyExists,"Not created");
	}
	}

