package Com.Maven_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_2 {
	
	public WebDriver driver;
	
	@FindBy(xpath=("//i[@class='icon-th-list']")) private WebElement drs1;
	
	@FindBy(xpath=("(//form[@class='compare-form'])[1]")) private WebElement drs2; 

	public Dress_2(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getDrs1() {
		return drs1;
	}

	public WebElement getDrs2() {
		return drs2;
	}

}
