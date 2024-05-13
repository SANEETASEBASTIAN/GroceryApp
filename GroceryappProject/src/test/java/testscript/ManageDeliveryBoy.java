package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageDeliveryBoyPage;

public class ManageDeliveryBoy extends Base {
	@Test

	public void manageDeliveryBoySearching() {

		String usernameValue = "admin";
		String passwordValue = "admin";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded, "unable to login the application");

		ManageDeliveryBoyPage manageDeliveryBoy = new ManageDeliveryBoyPage(driver);
		manageDeliveryBoy.clickingManageDeliveryBoy();
		manageDeliveryBoy.clickingSearchElement();
		manageDeliveryBoy.searchingElementByAddingName();
		manageDeliveryBoy.clickSearchButton();
		// manageDeliveryBoy.tabledispalyed();
		boolean isdisplayedtable = manageDeliveryBoy.tabledispalyed();
		Assert.assertTrue(isdisplayedtable);
		boolean searchButton = manageDeliveryBoy.searchButtonEnable();
		Assert.assertTrue(searchButton);
		// manageDeliveryBoy.searchButtonEnable();

	}

}
