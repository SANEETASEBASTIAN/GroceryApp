package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContentPage {
	WebDriver driver;

	public ManageContentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='nav-icon fas fa-edit']")
	WebElement manageContent;
	@FindBy(xpath = "//p[text()='Manage News']")
	WebElement manageNews;
	@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")
	WebElement manageNewsAddNew;
	@FindBy(xpath = "//textarea[@placeholder='Enter the news']")
	WebElement manageNewsAddNewNews;
	@FindBy(xpath = "//button[@name='create']")
	WebElement manageNewsSaveButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertMessageSuccess;

	public void manageContent() {
		manageContent.click();
	}

	public void manageNews() {
		manageNews.click();
	}

	public void manageNewsAddNew() {
		manageNewsAddNew.click();
	}

	public void manageNewsAddNewNews() {
		manageNewsAddNewNews.sendKeys("LockDown Alert");
	}

	public void saveButton() {
		manageNewsSaveButton.click();

	}
	public boolean alertMessageByCreatingNews() {
		return alertMessageSuccess.isDisplayed();
	}
}
