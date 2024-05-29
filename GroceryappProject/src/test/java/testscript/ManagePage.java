package testscript;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManagePagesPage;
import utilities.ExcelUtility;

public class ManagePage  extends Base {
	
	  @Test
	  
		public void addNewLocationandotherFieldsToaddNewLocationInformation() throws IOException {

			String usernameValue = ExcelUtility.getStringData(1, 0, "Login");
			String passwordValue = ExcelUtility.getStringData(1, 1, "Login");
			LoginPage loginPage = new LoginPage(driver);
			loginPage.enterUsernameOnUsernmeField(usernameValue);
			loginPage.enterPasswordOnPasswordField(passwordValue);
			loginPage.clickOnSignInButton();
			boolean isHomePageLoaded = loginPage.dashBoardCheck();
			Assert.assertTrue(isHomePageLoaded, "unable to login the application");
			
		  
		  ManagePagesPage managepagespage= new ManagePagesPage(driver);
		  String title=ExcelUtility.getStringData(1, 0, "ManagePagesPage");
		  String description=ExcelUtility.getStringData(1, 1, "ManagePagesPage");
		  String pagename=ExcelUtility.getStringData(1, 2, "ManagePagesPage");
		  String file=ExcelUtility.getStringData(1, 3, "ManagePagesPage");
		  managepagespage.clickingManageContent();
		  managepagespage.clickingManagePages();
		  managepagespage.clickingNewField();
		  managepagespage.enteringTitle(title);
		  managepagespage.enteringDescription(description);
		  managepagespage.enteringPageName(pagename);
		  managepagespage.choosingFile(file);
		  managepagespage.clickingSave(); 
		  
		 
		  boolean isMessageDisplayedAfterCreatingmanagepagespage=managepagespage.alertMessageDisplayAfterSaving();
		  Assert.assertTrue(isMessageDisplayedAfterCreatingmanagepagespage,"not displayed");
		  
	  }
	
  }

