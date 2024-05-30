package pages; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageSliderPage {
	WebDriver driver;
	public ManageSliderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Manage Slider']")
	WebElement manageSlider;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement manageSliderNew;
	@FindBy(xpath = "//input[@type='file']")
	WebElement manageSliderImage;
	@FindBy(xpath = "//input[@name='link']")
	WebElement manageSliderLink;
	@FindBy(xpath="//button[@name='create']")
	WebElement save;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertMessageSuccess;
	public void manageSlider() {
		manageSlider.click();
	}
	public void manageSliderADDNew() {
		manageSliderNew.click();
	}
	public void manageSliderADDImage(String file) {
		manageSliderImage.sendKeys(file);
	}
	public void manageSliderAddLink(String link) {
		manageSliderLink.sendKeys(link);
	}
	public void manageSliderAddSaveButton() {
		save.click();
}
	public boolean alertMessageByCreatingNewslider() {

		return alertMessageSuccess.isDisplayed();
	}
}