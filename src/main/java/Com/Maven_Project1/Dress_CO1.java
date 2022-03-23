package Com.Maven_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_CO1 {
	
	public static WebDriver driver;
	
	@FindBy(xpath=("//a[@title='Proceed to checkout']")) private WebElement check1;

	public Dress_CO1(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCheck1() {
		return check1;
	}
	
	

}
