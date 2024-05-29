package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class MobileSliderPage {
	WebDriver driver;

	public MobileSliderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//p[text()='Mobile Slider']")
	WebElement mobileSlider;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement moblieSliderNew;
	@FindBy(xpath = "//select[@name='cat_id']")
	WebElement moblieSliderCategory;
	@FindBy(xpath = "//input[@type='file']")
	WebElement moblieSliderImage;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement manageSliderSave;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertMessageSuccess;
	public void moblieSlider() {
		mobileSlider.click();
	}
	public void mobileSliderADDNew() {
		moblieSliderNew.click();
	}
	public void moblieSliderCategory(String category) {
		//Select select=new Select(moblieSliderCategory);
		//select.selectByVisibleText(category);
		PageUtility pageutility=new PageUtility();
		pageutility.selection(moblieSliderCategory,category);
	}
	public void moblieSliderImage(String file) {
		moblieSliderImage.sendKeys(file);
	}
	public void manageSliderAddSaveButton() {
		manageSliderSave.click();
}
	public boolean alertMessageByCreatingNewslider() {

		return alertMessageSuccess.isDisplayed();
	}
}

