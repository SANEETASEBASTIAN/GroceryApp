package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PushNotificationPage {
	WebDriver driver;

	public PushNotificationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-notifications']")
	WebElement pushNotification;
	@FindBy(xpath = "//input[@placeholder='Enter Title']")
	WebElement enteringTitle;
	@FindBy(xpath = "//input[@placeholder='Enter Description']")
	WebElement AddDescription;
	@FindBy(xpath = "//button[@name='create']")
	WebElement sendButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement saveSuccessfullalert;

	public void pushNotification() {
		pushNotification.click();
	}

	public void addingtitletotheTitleField(String title) {
		enteringTitle.sendKeys(title);
	}

	public void addingDescriptioninField(String description) {
		AddDescription.sendKeys(description);
	}

	public void clickingSendButton() {
		sendButton.click();

	}

	public boolean alertDisplaying() {
		return saveSuccessfullalert.isDisplayed();
	}
}
