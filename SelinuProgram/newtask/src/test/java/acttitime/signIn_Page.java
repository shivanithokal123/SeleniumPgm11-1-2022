package acttitime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class signIn_Page {
	//Declaration
	@FindBy(xpath="//input[(@name=\"username\")]")
	private WebElement username;
	@FindBy(xpath="//input[(@name=\"pwd\")]")
	private WebElement password;
	@FindBy(xpath="//a[(@class=\"initial\")]")
	private WebElement login;
	WebDriver driver;

		//Initilization
	public signIn_Page(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	//Usage
	public void setActitimeUn()
	{
		username.sendKeys("admin");
	}
	public void setActitimePwd()
	{
		password.sendKeys("manager");
	}
	public void verifyLoginButton()
	{
	login.click();
	}

}
