package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.PushNotificationPage;
import utilities.ExcelUtility;

public class PushNotificationCreation extends Base {
	@Test
	public void addNewElementsinPushNotification() throws IOException {

		String usernameValue = ExcelUtility.getStringData(1, 0, "Login");
		String passwordValue = ExcelUtility.getStringData(1, 1, "Login");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);								
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded,Constants.ERRORMESSAGEFORUNABLETOLOGIN);

		
		PushNotificationPage pushNotification = new PushNotificationPage(driver);
		String title =ExcelUtility.getStringData(1, 0, "PushNotifications");
		String description =ExcelUtility.getStringData(1, 1, "PusshNotifications");
		pushNotification.pushNotification();
		pushNotification.addingtitletotheTitleField(title);
		pushNotification.addingDescriptioninField(description);
		pushNotification.clickingSendButton();

		boolean isMessageDispalyedAfterCreatingExpence = pushNotification.alertDisplaying();
		Assert.assertTrue(isMessageDispalyedAfterCreatingExpence);
	}
}