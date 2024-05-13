package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageOrderPage {
	WebDriver driver;

	public ManageOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Manage Orders']")
	WebElement manageOrder;
	
	@FindBy(xpath = "//select[@onchange='show_cancel(113)']")
	WebElement changeStatusUpdate;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Order/details?details=113&page_ad=1']")
	WebElement view;
	@FindBy(xpath ="//table[@class='table table-striped']")
	WebElement table;
	
	
	WebElement addNewProductSave;

	public void manageOrder() {
		manageOrder.click();

	}

	
		
	

	public void viewDetailsOfOrder() {
		view.click();
	}
	public boolean table() {
		return table.isDisplayed();
	}
	}

	
