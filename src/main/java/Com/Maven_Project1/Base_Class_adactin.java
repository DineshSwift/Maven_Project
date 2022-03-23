package Com.Maven_Project1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class_adactin {

	public static WebDriver driver;

	public static WebDriver browserconfiguration(String type) {

		if (type.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("value"));
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();

		return driver;	
	}
	public static void geturl(String url) {
		driver.get(url);
	}
	public static void clickonElement(WebElement Element) {
		Element.click();
	}
	public static void inputvalueelement(WebElement Element, String data) {
		Element.sendKeys(data);
	}
	public static void dropdown(String type, WebElement Element,String value){
		Select s = new Select(Element);
		if (type.equalsIgnoreCase("byvalue")) {
			
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
	
	public static  void clearelement(WebElement Element) {
		Element.clear();

	}
	
	public static void jsexecutor(WebElement Element) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Element);
		
	}
	
	public static void sleep(int value) throws InterruptedException {
		Thread.sleep(value);
	}
	
	public static void tss ()throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Maven_Project1\\Screenshot\\image.png");
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
		
//	public static void slow(long Element) {
//		
//		driver.manage().timeouts().implicitlyWait(Element,TimeUnit.SECONDS);
		
		
		
	}
	}




