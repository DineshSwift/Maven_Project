package Com.Maven_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Payment {
	
	public static WebDriver driver;
	
	@FindBy(xpath=("//a[@title='Pay by bank wire']")) private WebElement Paymnt;
	
	public Dress_Payment(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getPaymnt() {
		return Paymnt;
	}

	public WebElement getPaymnt2() {
		return Paymnt2;
	}

	public WebElement getPaymnt3() {
		return Paymnt3;
	}

	@FindBy(xpath=("//span[text()='I confirm my order']")) private WebElement Paymnt2;
	
	@FindBy(xpath=("//a[@title='Back to orders']")) private WebElement Paymnt3;

}
