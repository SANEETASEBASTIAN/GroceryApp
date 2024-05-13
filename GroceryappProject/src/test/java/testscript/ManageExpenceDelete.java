package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageExpenceDeletePage;

public class ManageExpenceDelete extends Base {
  @Test
  public void deleteProductPage() {
	  String usernameValue = "admin";
	String passwordValue = "admin";
	LoginPage loginPage = new LoginPage(driver);
	loginPage.enterUsernameOnUsernmeField(usernameValue);
	loginPage.enterPasswordOnPasswordField(passwordValue);
	loginPage.clickOnSignInButton();
	boolean isHomePageLoaded = loginPage.dashBoardCheck();
	Assert.assertTrue(isHomePageLoaded, "unable to login the application");
	ManageExpenceDeletePage deletePro= new ManageExpenceDeletePage(driver);
 deletePro.maangeExpenece();
 deletePro.expenceCategory();
 deletePro.deleteProduct();
 deletePro.alertMessageSuccess();

  }
}
