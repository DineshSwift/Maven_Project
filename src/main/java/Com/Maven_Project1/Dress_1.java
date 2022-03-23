package Com.Maven_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_1 {
	
	public WebDriver driver;
	
	public Dress_1(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="(//a[text()='Dresses'])[2]") private WebElement drs1;
	
	@FindBy(xpath="(//a[text()='Evening Dresses'])[2]") private WebElement drs2;

	public WebElement getDrs1() {
		return drs1;
	}

	public WebElement getDrs2() {
		return drs2;
	}
	

}
