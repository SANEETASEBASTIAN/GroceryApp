package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManageExpenceDeletePage;
import utilities.ExcelUtility;

public class ManageExpenceDelete extends Base {
	@Test
	public void deleteProductPage() throws IOException {

		String usernameValue = ExcelUtility.getStringData(1, 0, "Login");
		String passwordValue = ExcelUtility.getStringData(1, 1, "Login");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded,Constants.ERRORMESSAGEFORUNABLETOLOGIN);
		ManageExpenceDeletePage deletePro = new ManageExpenceDeletePage(driver);
		deletePro.maangeExpenece();
		deletePro.expenceCategory();
		deletePro.deleteProduct();
		deletePro.alertMessageSuccess();

	}
}
