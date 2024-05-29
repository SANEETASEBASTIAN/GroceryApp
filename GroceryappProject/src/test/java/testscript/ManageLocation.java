package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageLocationPage;
import utilities.ExcelUtility;

public class ManageLocation extends Base {
	@Test
	public void addNewLocationandotherFieldsToaddNewLocationInformation() throws IOException {

		String usernameValue = ExcelUtility.getStringData(1, 0, "Login");
		String passwordValue = ExcelUtility.getStringData(1, 1, "Login");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded, "unable to login the application");
		
		ManageLocationPage manageLoc=new ManageLocationPage(driver);
		String text=ExcelUtility.getStringData(1, 0, "Managelocation");
		String state=ExcelUtility.getStringData(1, 1,"Managelocation");
		String location=ExcelUtility.getStringData(1, 2,"Managelocation");
		String deliverycharge=ExcelUtility.getStringData(1, 3,"Managelocation");
		
		manageLoc.manageLocaation();
		manageLoc.addNewLocation();
		manageLoc.addCountryNameIntheField(text);
		manageLoc.addStateNameIntheField(state);
		manageLoc.addLocationToTheField(location);
		manageLoc.addDeliveryChargeToTheField(deliverycharge);
		manageLoc.clickingSavebutton();
		boolean isMessageDispalyedAfterCreatingLoc=manageLoc.alertMessageByCreatingNewlocation();	
		Assert.assertTrue(isMessageDispalyedAfterCreatingLoc,"Not created");
		
	}
}
