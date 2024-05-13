package testscript;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManagePagesPage;

public class ManagePage  extends Base {
	
	  @Test
	  
		public void addNewLocationandotherFieldsToaddNewLocationInformation() {
			String usernameValue = "admin";
			String passwordValue = "admin";
			LoginPage loginPage = new LoginPage(driver);
			loginPage.enterUsernameOnUsernmeField(usernameValue);
			loginPage.enterPasswordOnPasswordField(passwordValue);
			loginPage.clickOnSignInButton();
			boolean isHomePageLoaded = loginPage.dashBoardCheck();
			Assert.assertTrue(isHomePageLoaded, "unable to login the application");
			
		  
		  ManagePagesPage managepagespage= new ManagePagesPage(driver);
		  managepagespage.clickingManageContent();
		  managepagespage.clickingManagePages();
		  managepagespage.clickingNewField();
		  managepagespage.enteringTitle();
		  managepagespage.enteringDescription();
		  managepagespage.enteringPageName();
		  managepagespage.choosingFile();
		  managepagespage.clickingSave();
		  managepagespage.alertMessageDisplayAfterSaving();
		 
		  boolean isMessageDisplayedAfterCreatingmanagepagespage=managepagespage.alertMessageDisplayAfterSaving();
		  Assert.assertTrue(isMessageDisplayedAfterCreatingmanagepagespage,"not displayed");
		  
	  }
	
  }

