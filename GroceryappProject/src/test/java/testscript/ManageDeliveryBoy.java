package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageDeliveryBoyPage;
import utilities.ExcelUtility;

public class ManageDeliveryBoy extends Base {
	@Test//(groups = { "smoke" },retryAnalyzer=retry.Retry.class)
//@Parameters("browser")
	public void manageDeliveryBoySearching(/*String browser*/) throws IOException {

		String usernameValue = ExcelUtility.getStringData(1, 0, "Login");
		String passwordValue = ExcelUtility.getStringData(1, 1, "Login");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded, "unable to login the application");

		ManageDeliveryBoyPage manageDeliveryBoy = new ManageDeliveryBoyPage(driver);
		String name = ExcelUtility.getStringData(1, 0, "ManageDelivery");

		manageDeliveryBoy.clickingManageDeliveryBoy();
		manageDeliveryBoy.clickingSearchElement();
		manageDeliveryBoy.searchingElementByAddingName(name);
		manageDeliveryBoy.clickSearchButton();
		boolean isdisplayedtable = manageDeliveryBoy.tabledispalyed();
		Assert.assertTrue(isdisplayedtable);
		boolean searchButton = manageDeliveryBoy.searchButtonEnable();
		Assert.assertTrue(searchButton);

	}

}
