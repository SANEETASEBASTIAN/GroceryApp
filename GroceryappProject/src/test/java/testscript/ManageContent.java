package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContentPage;

public class ManageContent extends Base {
  @Test
  public void manageContentAddNewNews() {
	  
			String usernameValue = "admin";
			String passwordValue = "admin";
			LoginPage loginPage = new LoginPage(driver);
			loginPage.enterUsernameOnUsernmeField(usernameValue);
			loginPage.enterPasswordOnPasswordField(passwordValue);
			loginPage.clickOnSignInButton();
			boolean isHomePageLoaded = loginPage.dashBoardCheck();
			Assert.assertTrue(isHomePageLoaded, "unable to login the application");
			
			ManageContentPage manageContent=new ManageContentPage(driver);
			manageContent.manageContent();
			manageContent.manageNews();
			manageContent.manageNewsAddNew();
			manageContent.manageNewsAddNewNews();
			manageContent.saveButton();
			boolean isMessageDispalyedAfterCreatingNews=manageContent.alertMessageByCreatingNews();	
			Assert.assertTrue(isMessageDispalyedAfterCreatingNews,"Not created");
  }
}
