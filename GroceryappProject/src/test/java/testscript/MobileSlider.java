package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.MobileSliderPage;
import utilities.ExcelUtility;

public class MobileSlider extends Base{
  @Test
  public void addnewListFromManagePage() throws IOException {

		String usernameValue = ExcelUtility.getStringData(1, 0, "Login");
		String passwordValue = ExcelUtility.getStringData(1, 1, "Login");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded,Constants.ERRORMESSAGEFORUNABLETOLOGIN);
		
		MobileSliderPage mobileSider=new MobileSliderPage(driver);

		String category = ExcelUtility.getStringData(1, 0, "MobileSlider");
		String file = ExcelUtility.getStringData(1, 1, "MobileSlider");
		mobileSider.moblieSlider();
		mobileSider.mobileSliderADDNew();
		mobileSider.moblieSliderCategory(category);
		mobileSider.moblieSliderImage(file);
		mobileSider.manageSliderAddSaveButton();
		boolean isMessageDispalyedAfterCreatingSlider =mobileSider.alertMessageByCreatingNewslider();	
		Assert.assertTrue(isMessageDispalyedAfterCreatingSlider,"Not created");
	}
		 
  
}

