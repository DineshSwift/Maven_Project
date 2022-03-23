package Com.Maven_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_4 {
	
	public static WebDriver driver;
	
	@FindBy(xpath=("//span[text()='Add to cart']")) private WebElement drs1;

	public Dress_4(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);

	}

	public WebElement getDrs1() {
		return drs1;
	}
	
	
	

}
