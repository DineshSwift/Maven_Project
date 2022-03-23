package Com.Maven_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_CO4 {
	
	public static WebDriver driver;
	
	@FindBy(id="cgv") private WebElement checkbox;
	
	@FindBy(xpath=("(//button[@type='submit'])[2]")) private WebElement check2;

	public WebElement getCheck2() {
		return check2;
	}

	public void setCheck2(WebElement check2) {
		this.check2 = check2;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public Dress_CO4(WebDriver driver2) {
	
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

}
