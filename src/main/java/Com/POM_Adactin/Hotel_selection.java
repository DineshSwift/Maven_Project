package Com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_selection {
	
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0") private WebElement btn;
	
	@FindBy(id="continue") private WebElement btn1;

	public Hotel_selection(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getBtn1() {
		return btn1;
	}
	

}
