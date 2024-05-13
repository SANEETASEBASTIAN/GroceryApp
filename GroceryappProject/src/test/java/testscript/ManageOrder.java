package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageOrderPage;

public class ManageOrder extends Base {
  @Test
  public void addingNewProduct() {
	  String usernameValue = "admin";
		String passwordValue = "admin";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded, "unable to login the application");
		
		ManageOrderPage manageOrder=new ManageOrderPage(driver);
		manageOrder.manageOrder();
		
		manageOrder.viewDetailsOfOrder();
		boolean isdisplayedtable = manageOrder.table();
		Assert.assertTrue(isdisplayedtable);
	
		
  }
}
