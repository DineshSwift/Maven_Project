package Com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final_page1 {
	
	public static WebDriver driver;
	
	@FindBy(id="book_now") private WebElement book;
	
	@FindBy(id="my_itinerary") private WebElement last;

	public Final_page1(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getLast() {
		return last;
	}
	
	
	

}
