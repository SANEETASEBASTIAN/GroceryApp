package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageLocationPage;

public class ManageLocation extends Base {
	@Test
	public void addNewLocationandotherFieldsToaddNewLocationInformation() {
		String usernameValue = "admin";
		String passwordValue = "admin";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded, "unable to login the application");
		
		ManageLocationPage manageLoc=new ManageLocationPage(driver);
		manageLoc.manageLocaation();
		manageLoc.addNewLocation();
		manageLoc.addCountryNameIntheField();
		manageLoc.addStateNameIntheField();
		manageLoc.addLocationToTheField();
		manageLoc.addDeliveryChargeToTheField();
		manageLoc.clickingSavebutton();
		boolean isMessageDispalyedAfterCreatingLoc=manageLoc.alertMessageByCreatingNewlocation();	
		Assert.assertTrue(isMessageDispalyedAfterCreatingLoc,"Not created");
		
	}
}
