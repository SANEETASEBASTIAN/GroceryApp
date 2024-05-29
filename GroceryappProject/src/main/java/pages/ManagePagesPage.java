package pages;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

	public class ManagePagesPage {
		WebDriver driver;
		public ManagePagesPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//i[@class='nav-icon fas fa-edit']")WebElement managecontent;
		@FindBy(xpath="//p[text()='Manage Pages']")WebElement managepages;
		@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newfield;
		@FindBy(xpath="//input[@placeholder='Enter the Title']")WebElement entertitle;
		@FindBy(xpath="//div[@contenteditable='true']")WebElement descriptions;
		@FindBy(xpath="//input[@placeholder='Enter Page Name']")WebElement enterpagename;
		@FindBy(xpath="//input[@name='main_img']")WebElement choosefile;
		@FindBy(xpath="//button[text()='Save']")WebElement save;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
		public void clickingManageContent()
		{
			managecontent.click();
		}
		public void clickingManagePages()
		{
			managepages.click();
		}
		public void clickingNewField()
		{
			newfield.click();
		}
		public void enteringTitle(String title)
		{
			entertitle.sendKeys(title);
		}
		public void enteringDescription(String description)
		{
			descriptions.sendKeys(description);
		}
		public void enteringPageName(String pagename)
		{
			enterpagename.sendKeys(pagename);
		}
		public void choosingFile(String file)
		{
			choosefile.sendKeys(file);
		}
		public void clickingSave()
		{
			WaitUtility wait=new WaitUtility();
			wait.waitForElementClick(driver, save);
			save.click();
		}
		
		public boolean alertMessageDisplayAfterSaving()
		{
		 return alert.isDisplayed();
		}
	}
		

