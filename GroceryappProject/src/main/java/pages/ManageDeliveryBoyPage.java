package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageDeliveryBoyPage {
	WebDriver driver;

	public ManageDeliveryBoyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Manage Delivery Boy']")
	WebElement manageDeliveryBoy;
	@FindBy(xpath = "//a[@href='javascript:void(0)']")
	WebElement searchElementFromDeliveryBoy;
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement searchElementByEnteringName;	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']")
	WebElement tableDisplayed;
	@FindBy(xpath = "//button[@name='Search']")
	WebElement clickingSearchButton;


	public void clickingManageDeliveryBoy() {
		manageDeliveryBoy.click();

	}

	public void clickingSearchElement() {
		searchElementFromDeliveryBoy.click();

	}

	public void searchingElementByAddingName() {
		searchElementByEnteringName.sendKeys("test");

	}

	public void clickSearchButton() {
		clickingSearchButton.click();

	}

	public boolean tabledispalyed() {
		return tableDisplayed.isDisplayed();

	}

	public boolean searchButtonEnable() {
		return clickingSearchButton.isEnabled();
	}

}
