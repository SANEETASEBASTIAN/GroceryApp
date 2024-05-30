package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageSliderPage;
import utilities.ExcelUtility;

public class ManageSlider extends Base {
  @Test
  public void AddNewSlider() throws IOException {
	  

		String usernameValue = ExcelUtility.getStringData(1, 0, "Login");
		String passwordValue = ExcelUtility.getStringData(1, 1, "Login");
			LoginPage loginPage = new LoginPage(driver);
			loginPage.enterUsernameOnUsernmeField(usernameValue);
			loginPage.enterPasswordOnPasswordField(passwordValue);
			loginPage.clickOnSignInButton();
			boolean isHomePageLoaded = loginPage.dashBoardCheck();
			Assert.assertTrue(isHomePageLoaded,Constants.ERRORMESSAGEFORUNABLETOLOGIN);
			
			ManageSliderPage manageSlider=new ManageSliderPage(driver);
			String file=ExcelUtility.getStringData(1, 0,"ManageSlider");
			String link=ExcelUtility.getStringData(1, 1,"ManageSlider");
			manageSlider.manageSlider();
			manageSlider.manageSliderADDNew();
			manageSlider.manageSliderADDImage(file);
			manageSlider.manageSliderAddLink(link);
			manageSlider.manageSliderAddSaveButton();
			boolean isMessageDispalyedAfterCreatingSlider=manageSlider.alertMessageByCreatingNewslider();	
			Assert.assertTrue(isMessageDispalyedAfterCreatingSlider,"Not created");
		}
  }

