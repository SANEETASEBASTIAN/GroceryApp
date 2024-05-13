package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageProductSerachPage {

WebDriver driver;

public  ManageProductSerachPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//p[text()='Manage Product']")
WebElement manageProduct;
@FindBy(xpath ="//a[@href='javascript:void(0)']")
WebElement manageProductSearch;
@FindBy(xpath = "//input[@placeholder='Title']")
WebElement manageProductSearchTitle;
@FindBy(xpath = "//input[@placeholder='Product Code']")
WebElement manageProductSearchProductCode;
@FindBy(xpath = "//select[@name='cat_id']")
WebElement manageProductSearchCategory;
@FindBy(xpath = "//select[@name='sb']")
WebElement manageProductSearchSubCategory;
@FindBy(xpath = "//button[@name='Search']")
WebElement manageProductSearchSave;
@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']")
WebElement tableDisplayed;
public void manageProuct() {
	manageProduct.click();
}
public void managePrSerach() {
	manageProductSearch.click();
}
public void manageProuctSearchTitle() {
	manageProductSearchTitle.sendKeys("Biriyani");
}
public void manageProuctSearchProductCode() {
	manageProductSearchProductCode.sendKeys("1");
}
public void manageProuctSearchCategory() {
	Select select=new Select(manageProductSearchCategory);
	select.selectByIndex(5);
}
public void manageProductSearchSubCategory(){
	Select select=new Select(manageProductSearchCategory);
	select.selectByIndex(0);
}
public void SearchElement() {
	manageProductSearchSave.click();
}
public boolean tabledispalyed() {
	return tableDisplayed.isDisplayed();

}
}
