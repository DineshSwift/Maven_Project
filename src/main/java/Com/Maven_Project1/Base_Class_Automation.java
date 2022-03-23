package Com.Maven_Project1;
import java.awt.Desktop.Action;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class_Automation {
	public static WebDriver driver;

	public static WebDriver browserconfiguration(String type) {
		if (type.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
			driver=new ChromeDriver();
		}
		else if(type.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("value"));
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;	
	}
	
	public static void sleep(int value) throws InterruptedException {
		Thread.sleep(value);
	}
	
	public static void geturl(String url) {
		driver.get(url);
	}
	
	public static void inputvalue(WebElement Element,String data) {
		Element.sendKeys(data);
	}
	
	public static void clickelement(WebElement Element) {
		Element.click();
	}
	
	public static void hover(WebElement Element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(Element).build().perform();
	}
	public static void scroll(WebElement Element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Element);
	}
	
	public static void dropdown(String type,WebElement Element,String value) {
		Select s = new Select(Element);
		if(type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
		}
		else if(type.equalsIgnoreCase("byText")) {
			s.selectByVisibleText(value);	
		}
		else if(type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
		
	}

}
