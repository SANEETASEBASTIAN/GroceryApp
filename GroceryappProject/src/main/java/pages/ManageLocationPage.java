package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.PageUtility;

public class ManageLocationPage {
	WebDriver driver;

	public ManageLocationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}   

	@FindBy(xpath = "//p[text()='Manage Location']")
	WebElement manageLocation;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement addNewLocation;
	@FindBy(xpath = "//select[@name='country_id']")
	WebElement addCountryNameFromtheDropDown;
	@FindBy(xpath = "//select[@name='state_id']")
	WebElement addStateFromtheList;
	@FindBy(xpath = "//input[@placeholder='Enter the Location']")
	WebElement addLocationTofield;
	@FindBy(xpath = "//input[@placeholder='Enter the Delivery Charge']")
	WebElement addDeliveryCharge;
	@FindBy(xpath="//button[@type='submit']")
	WebElement buttonSave;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertMessageSuccess;

	public void manageLocaation() {

		manageLocation.click();
	}

	public void addNewLocation() {

		addNewLocation.click();
	}

	public void addCountryNameIntheField(String text) {

		//Select select = new Select(addCountryNameFromtheDropDown);
		//select.selectByVisibleText(text);
		PageUtility pageutility=new PageUtility();
		pageutility.selection(addCountryNameFromtheDropDown,text);
	}

	public void addStateNameIntheField(String state) {

		//Select select = new Select(addStateFromtheList);
		//select.selectByVisibleText(state);
		PageUtility pageutility=new PageUtility();
		pageutility.selection(addStateFromtheList,state);
	}

	public void addLocationToTheField(String location) {
		addLocationTofield.sendKeys(location);
	}

	public void addDeliveryChargeToTheField(String deliverycharge) {
		addDeliveryCharge.sendKeys(deliverycharge);
	}

	public void clickingSavebutton()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));


		buttonSave.click();
	}

	public boolean alertMessageByCreatingNewlocation() {

		return alertMessageSuccess.isDisplayed();
	}
}