package acttitime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home_Page  {
	//Declaration
	 @FindBy(xpath="//span[@class='dashedLink']")
	private WebElement newtask;
	 
	 @FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logout;
	 
	 @FindBy(xpath="//button[@id='ext-gen19']")
	 private WebElement action;
	 
	 @FindBy (xpath="//a[@id='ext-gen111']")
	 private WebElement dropValue;
	 
  @FindBy(xpath="//input[@id='createTasksPopup_newCustomer']")
  private WebElement newCoustmerUN;
  
  @FindBy(xpath="//input[@id='createTasksPopup_newProject']")
  private WebElement newCoustmerProjectName;
  
  @FindBy(xpath="//input[@class='inputFieldWithPlaceholder']")
  private WebElement taskinputname;
  
  @FindBy(xpath="//a[(@id='descriptionElement')]")
  private WebElement descriptionOpenButton;
  
  @FindBy(xpath="//textarea[(@id='editDescriptionPopupText')]")
  private WebElement descriptionBox;
  
  @FindBy(xpath="//input[(@id='scbutton')]")
  private WebElement descriptionSubBtn; 
  
  @FindBy(xpath="//button[(@id='ext-gen38')]")
  private WebElement setDeadLine;
  
  @FindBy(xpath="//span[text()='12']")
  private WebElement selectDate;
	 
  
  	@FindBy(xpath="//button[@id='ext-gen48']")
  	private WebElement selectBillable;
  	
  	
  	@FindBy(xpath="//a[text()='Billable']")
  	private WebElement selectBillableDrop;
  	
  	@FindBy(xpath="//div[@id='createTasksPopup_commitBtn']")
  	private WebElement selectCreateTask;
  
	WebDriver driver;
	//Initialization
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Usage
	public void newClass()  {
		
		newtask.click();
		
	}
	
 	public void newcoustmer() throws InterruptedException
	{
 		
		
 		
 		action.click();
 		dropValue.click();
 		newCoustmerUN.sendKeys("Shruti");
 		newCoustmerProjectName.sendKeys("Thokal");
 		taskinputname.sendKeys("UNB Site Not Wrking");
 		descriptionOpenButton.click();
 		descriptionBox.sendKeys("Added Description");
 		Thread.sleep(5000);
 		descriptionSubBtn.click();
 		setDeadLine.click();
 		selectDate.click();
 		selectBillable.click();
 		Thread.sleep(2000);
 		selectBillableDrop.click();
 		selectCreateTask.click();

	}
	public void verifyActitimeLogout()
	{
	logout.click();

}
}
