package Com.Maven_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_3 {
	
	public WebDriver driver;
	
	
	@FindBy(xpath=("//span[text()='More']")) private WebElement drs1;
	
	@FindBy(xpath=(("//i[@class='icon-plus']"))) private WebElement drs2;
	
	@FindBy(id=("group_1")) private WebElement drs3;
	
	@FindBy(id=("color_24")) private WebElement drs4;

	public Dress_3(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getDrs1() {
		return drs1;
	}

	public WebElement getDrs2() {
		return drs2;
	}

	public WebElement getDrs3() {
		return drs3;
	}

	public WebElement getDrs4() {
		return drs4;
	}

}
