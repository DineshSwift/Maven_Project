package Com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_page {
	
	public static WebDriver driver;
	
	@FindBy(id="location") private WebElement loc;
	
	public Booking_page(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotl() {
		return hotl;
	}

	public WebElement getRoomty() {
		return roomty;
	}

	public WebElement getRoom() {
		return room;
	}

	@FindBy(id="hotels") private WebElement hotl;
	
	@FindBy(id="room_type") private WebElement roomty; 
	
	@FindBy(id="room_nos") private WebElement room;
	
	

}
