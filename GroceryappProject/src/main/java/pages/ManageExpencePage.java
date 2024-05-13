package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageExpencePage {
	WebDriver driver;

	public ManageExpencePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='nav-icon fas fa-money-bill-alt']")
	WebElement manageExpence;
	@FindBy(xpath = "//p[text()='Expense Category']")
	WebElement expenceCategory;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement addNew;
	@FindBy(xpath = "//input[@name='name']")
	WebElement addTitle;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement saveTitle;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertMessageSuccess;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement alertMessageDismiss;
	public void clickManageExpence() {
		manageExpence.click();
	}

	public void clickExpenceCategory() {
		expenceCategory.click();
	}

	public void clickNew() {
		addNew.click();
	}

	public void EnterTitle() {
		addTitle.sendKeys("HelloNewExpence123");
	}

	public void clickingSaveButton() {
		saveTitle.click();
	}

	public boolean alertMessageByCreatingNewExpence() {

		return alertMessageSuccess.isDisplayed();

	}
	public boolean alertMessageAlreadyExists() {

		return alertMessageDismiss.isDisplayed();

	}



	

}
