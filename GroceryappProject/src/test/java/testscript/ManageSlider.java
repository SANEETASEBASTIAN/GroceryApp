package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageSliderPage;

public class ManageSlider extends Base {
  @Test
  public void AddNewSlider() {
	  
			String usernameValue = "admin";
			String passwordValue = "admin";
			LoginPage loginPage = new LoginPage(driver);
			loginPage.enterUsernameOnUsernmeField(usernameValue);
			loginPage.enterPasswordOnPasswordField(passwordValue);
			loginPage.clickOnSignInButton();
			boolean isHomePageLoaded = loginPage.dashBoardCheck();
			Assert.assertTrue(isHomePageLoaded, "unable to login the application");
			
			ManageSliderPage manageSlider=new ManageSliderPage(driver);
			manageSlider.manageSlider();
			manageSlider.manageSliderADDNew();
			manageSlider.manageSliderADDImage();
			manageSlider.manageSliderAddLink();
			manageSlider.manageSliderAddSaveButton();
			boolean isMessageDispalyedAfterCreatingSlider=manageSlider.alertMessageByCreatingNewslider();	
			Assert.assertTrue(isMessageDispalyedAfterCreatingSlider,"Not created");
		}
  }

