package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageProductSerachPage;
import utilities.ExcelUtility;

public class ManageProductSearch extends Base {
  @Test
  public void searchElementFromManageProduct() throws IOException {

		String usernameValue = ExcelUtility.getStringData(1, 0, "Login");
		String passwordValue = ExcelUtility.getStringData(1, 1, "Login");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded, "unable to login the application");
		
		ManageProductSerachPage manageProduct=new ManageProductSerachPage(driver);
		String title=ExcelUtility.getStringData(1,0, "MangeProductSearch");
		String code=ExcelUtility.getStringData(1,1, "MangeProductSearch");
		String category=ExcelUtility.getStringData(1,2, "MangeProductSearch");
		String  subcategory=ExcelUtility.getStringData(1, 3,"MangeProductSearch");
		manageProduct.manageProuct();
		manageProduct.managePrSerach();
		manageProduct.manageProuctSearchTitle(title);
		manageProduct.manageProuctSearchProductCode(code);
		manageProduct.manageProuctSearchCategory(category);
		manageProduct.manageProductSearchSubCategory(subcategory);
		manageProduct.SearchElement();
		boolean isdisplayedtable = manageProduct.tabledispalyed();
		Assert.assertTrue(isdisplayedtable);
  }
}