package Com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final_page {
	
	public static WebDriver driver;
	
	@FindBy(id="first_name") private WebElement name1;
	
	@FindBy(id="last_name") private WebElement name2;
	
	@FindBy(id="address") private WebElement addrs;
	
	@FindBy(id="cc_num") private WebElement cardno;
	
	@FindBy(id="cc_type") private WebElement cardtype;
	
	@FindBy(id="cc_exp_month") private WebElement month;
	
	@FindBy(id="cc_exp_year") private WebElement year;
	
	@FindBy(id="cc_cvv") private WebElement cvv;

	public Final_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getName1() {
		return name1;
	}

	public WebElement getName2() {
		return name2;
	}

	public WebElement getAddrs() {
		return addrs;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	} 
	
	

}
