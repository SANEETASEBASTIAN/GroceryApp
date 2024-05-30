package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageContentPage;
import utilities.ExcelUtility;

public class ManageContent extends Base {
	@Test(retryAnalyzer =  retry.Retry.class)
	public void manageContentAddNewNews() throws IOException {

		String usernameValue = ExcelUtility.getStringData(1, 0, "Login");
		String passwordValue = ExcelUtility.getStringData(1, 1, "Login");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded,Constants.ERRORMESSAGEFORUNABLETOLOGIN);

		ManageContentPage manageContent = new ManageContentPage(driver);
		String newElement = ExcelUtility.getStringData(1, 0, "ManageContentAdd");
		manageContent.manageContent();
		manageContent.manageNews();
		manageContent.manageNewsAddNew();
		manageContent.manageNewsAddNewNews(newElement);
		manageContent.saveButton();
		boolean isMessageDispalyedAfterCreatingNews = manageContent.alertMessageByCreatingNews();
		Assert.assertTrue(isMessageDispalyedAfterCreatingNews, "Not created");
	}
}
