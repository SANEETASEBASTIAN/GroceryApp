package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageProductSerachPage;

public class ManageProductSearch extends Base {
  @Test
  public void searchElementFromManageProduct() {
	  String usernameValue = "admin";
		String passwordValue = "admin";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded, "unable to login the application");
		
		ManageProductSerachPage manageProduct=new ManageProductSerachPage(driver);
		manageProduct.manageProuct();
		manageProduct.managePrSerach();
		manageProduct.manageProuctSearchTitle();
		manageProduct.manageProuctSearchProductCode();
		manageProduct.manageProuctSearchCategory();
		manageProduct.manageProductSearchSubCategory();
		manageProduct.SearchElement();
		boolean isdisplayedtable = manageProduct.tabledispalyed();
		Assert.assertTrue(isdisplayedtable);
  }
}