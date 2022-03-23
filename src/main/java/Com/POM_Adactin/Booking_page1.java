package Com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_page1 {
	
	public static WebDriver driver;
	
	@FindBy(id="datepick_in") private WebElement date1;
	
	@FindBy(id="datepick_out") private WebElement date2;
	
	@FindBy(id="adult_room") private WebElement adult;
	
	@FindBy(id="child_room") private WebElement child;
	
	@FindBy(id="Submit") private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	public Booking_page1(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getDate1() {
		return date1;
	}

	public WebElement getDate2() {
		return date2;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}
	
	

}
