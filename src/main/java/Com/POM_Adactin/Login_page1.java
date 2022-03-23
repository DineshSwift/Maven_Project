package Com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page1 {
	
	public static WebDriver driver;
	
	@FindBy(id="username") private WebElement email;

	public Login_page1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id="password") private WebElement pwd;
	
	@FindBy(id="login") private WebElement login; 

}
