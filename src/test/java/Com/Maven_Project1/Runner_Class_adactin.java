package Com.Maven_Project1;

import java.io.IOException;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Runner_Class_adactin extends Base_Class_adactin {
	
	public static WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException, IOException {
		
		driver=browserconfiguration("chrome");
		
		geturl("https://adactinhotelapp.com/index.php");
		
		WebElement name = driver.findElement(By.id("username"));
		inputvalueelement(name, "Dineshk17");
		
		WebElement pwd = driver.findElement(By.id("password"));
		inputvalueelement(pwd, "Dinesh171094");
		
		WebElement login = driver.findElement(By.id("login"));
		clickonElement(login);
		
		sleep(1000);
		
		WebElement dropdown1 = driver.findElement(By.id("location"));
		dropdown("byText",dropdown1, "London");
		sleep(1000);	
		WebElement dropdown2 = driver.findElement(By.id("hotels"));
		dropdown("byText",dropdown2, "Hotel Sunshine");
		
		sleep(1000);
		WebElement dropdown3 = driver.findElement(By.id("room_type"));
		dropdown("byText",dropdown3, "Deluxe");
	
		sleep(1000);
		WebElement dropdown4 = driver.findElement(By.id("room_nos"));
		dropdown("byText",dropdown4, "3 - Three");
		
		sleep(1000);
		WebElement date1 = driver.findElement(By.id("datepick_in"));
		clearelement(date1);
		inputvalueelement(date1, "10/04/2022");
		
		sleep(1000);
		WebElement date2 = driver.findElement(By.id("datepick_out"));
		clearelement(date2);
		inputvalueelement(date2, "11/04/2022");
		
		sleep(1000);
		WebElement dropdown5 = driver.findElement(By.id("adult_room"));
		dropdown("byIndex",dropdown5 ,"2");
		
		sleep(1000);
		WebElement dropdown6 = driver.findElement(By.id("child_room"));
		dropdown("byvalue", dropdown6,"2");
		
		sleep(1000);
		WebElement search = driver.findElement(By.id("Submit"));
		clickonElement(search);
		
		sleep(1000);
		WebElement button = driver.findElement(By.id("radiobutton_0"));
		clickonElement(button);
		
		sleep(1000);
		WebElement next = driver.findElement(By.id("continue"));
		clickonElement(next);
		
		sleep(1000);
		WebElement scroll = driver.findElement(By.id("address"));
		jsexecutor(scroll);
		
		sleep(1000);
		WebElement name1 = driver.findElement(By.id("first_name"));
		inputvalueelement(name1, "DINESH");
		
		sleep(1000);
		WebElement lastname = driver.findElement(By.id("last_name"));
		inputvalueelement(lastname, "K");
		
		sleep(1000);
		WebElement address = driver.findElement(By.id("address"));
		inputvalueelement(address,"4-109 NETHAJI STREET,Madurai-625006");
		
		sleep(1000);
		WebElement card = driver.findElement(By.id("cc_num"));
		inputvalueelement(card, "9876543210123456");
		
		sleep(1000);
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		dropdown("byText", cardtype, "Master Card");
		
		sleep(1000);
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		dropdown("byvalue", month, "10");
		
		sleep(1000);
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		dropdown("byText",year,"2022");
		
		sleep(1000);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		inputvalueelement(cvv, "012");
		
		sleep(1000);
		WebElement btn = driver.findElement(By.id("book_now"));
		clickonElement(btn);
		
		sleep(6000);
		WebElement lastone = driver.findElement(By.id("my_itinerary"));
		clickonElement(lastone);
		
		sleep(2000);
		tss ();
		
		

		
	}



}
