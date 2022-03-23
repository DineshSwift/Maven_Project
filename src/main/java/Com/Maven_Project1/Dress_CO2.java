package Com.Maven_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_CO2 {
	public static WebDriver driver;
	
	@FindBy(xpath=("//span[text()='Proceed to checkout']")) private WebElement check;

	public Dress_CO2(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCheck() {
		return check;
	}
	
	

}
