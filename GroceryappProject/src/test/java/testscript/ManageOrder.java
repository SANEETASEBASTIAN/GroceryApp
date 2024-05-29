package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageOrderPage;
import utilities.ExcelUtility;

public class ManageOrder extends Base {
  @Test
  public void addingNewProduct() throws IOException {

		String usernameValue = ExcelUtility.getStringData(1, 0, "Login");
		String passwordValue = ExcelUtility.getStringData(1, 1, "Login");
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
