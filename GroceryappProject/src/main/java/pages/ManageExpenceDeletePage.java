package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageExpenceDeletePage {
	WebDriver driver;

	public ManageExpenceDeletePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='nav-icon fas fa-money-bill-alt']")
	WebElement manageExpence;
	@FindBy(xpath = "//p[text()='Expense Category']")
	WebElement expenceCategory;
	@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/Expense/cat_delete?del=3337&page_ad=1']")
	WebElement delete;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertMessageSuccess;
	

	public void maangeExpenece() {
		manageExpence.click();
	}
	public void expenceCategory() {
		expenceCategory.click();
	}

	public void deleteProduct() {
		delete.click();
		driver.switchTo().alert().accept();
	}
	public void  alertMessageSuccess() {
		 alertMessageSuccess.click();
	}
}
