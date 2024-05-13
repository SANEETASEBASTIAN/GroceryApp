package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MobileSliderPage;

public class MobileSlider extends Base{
  @Test
  public void addnewListFromManagePage() {
	  String usernameValue = "admin";
		String passwordValue = "admin";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded, "unable to login the application");
		
		MobileSliderPage mobileSider=new MobileSliderPage(driver);
		mobileSider.moblieSlider();
		mobileSider.mobileSliderADDNew();
		mobileSider.moblieSliderCategory();
		mobileSider.moblieSliderImage();
		mobileSider.manageSliderAddSaveButton();
		boolean isMessageDispalyedAfterCreatingSlider =mobileSider.alertMessageByCreatingNewslider();	
		Assert.assertTrue(isMessageDispalyedAfterCreatingSlider,"Not created");
	}
		 
  
}

