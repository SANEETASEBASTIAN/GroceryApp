package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.PushNotificationPage;

public class PushNotificationCreation extends Base {
	@Test
	public void addNewElementsinPushNotification() {
		String usernameValue = "admin";
		String passwordValue = "admin";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernmeField(usernameValue);								
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.clickOnSignInButton();
		boolean isHomePageLoaded = loginPage.dashBoardCheck();
		Assert.assertTrue(isHomePageLoaded, "able to login the application");

		String description = "Obsqura here";
		String title = "Hai Saneeta";
		PushNotificationPage pushNotification = new PushNotificationPage(driver);
		pushNotification.pushNotification();
		pushNotification.addingtitletotheTitleField(title);
		pushNotification.addingDescriptioninField(description);
		pushNotification.clickingSendButton();

		boolean isMessageDispalyedAfterCreatingExpence = pushNotification.alertDisplaying();
		Assert.assertTrue(isMessageDispalyedAfterCreatingExpence);
	}
}