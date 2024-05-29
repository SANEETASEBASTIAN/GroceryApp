package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

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
public void manageProuctSearchTitle(String title) {
	manageProductSearchTitle.sendKeys(title);
}
public void manageProuctSearchProductCode(String code) {
	manageProductSearchProductCode.sendKeys(code);
}
public void manageProuctSearchCategory(String category) {
	//Select select=new Select(manageProductSearchCategory);
	//select.selectByVisibleText(category);
	PageUtility pageutility=new PageUtility();
	pageutility.selection(manageProductSearchCategory,category);
}
public void manageProductSearchSubCategory(String subcategory){
	//Select select=new Select(manageProductSearchCategory);
	//select.selectByVisibleText(subcategory );
	PageUtility pageutility=new PageUtility();
	pageutility.selection(manageProductSearchSubCategory,subcategory);
}
public void SearchElement() {
	manageProductSearchSave.click();
}
public boolean tabledispalyed() {
	return tableDisplayed.isDisplayed();

}
}
