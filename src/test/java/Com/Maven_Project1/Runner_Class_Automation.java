package Com.Maven_Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Runner_Class_Automation extends Base_Class_Automation{
	
	public static WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException {
		
		driver=browserconfiguration("chrome");
		
		geturl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		sleep(1000);
		WebElement email = driver.findElement(By.id("email"));
		inputvalue(email, "dineshbemech@gmail.com");
		
		sleep(1000);
		WebElement pwd = driver.findElement(By.id("passwd"));
		inputvalue(pwd, "8072935442");
		
		sleep(1000);
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		clickelement(login);
		
		sleep(2000);
		WebElement dress = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		hover(dress);
		
		sleep(1000);
		WebElement dress1 = driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[2]"));
		clickelement(dress1);
		
		sleep(2000);
		WebElement more = driver.findElement(By.xpath("//i[@class='icon-th-list']"));
		clickelement(more);
		
		sleep(1000);
		WebElement down = driver.findElement(By.xpath("(//form[@class='compare-form'])[1]"));
		scroll(down);
		
		sleep(1000);
		WebElement cart = driver.findElement(By.xpath("//span[text()='More']"));
		clickelement(cart);
		
		sleep(1000);
		WebElement icon = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		clickelement(icon);
		
		sleep(1000);
		WebElement dropdown1 = driver.findElement(By.id("group_1"));
		dropdown("byText", dropdown1,"L");
		
		sleep(1000);
		WebElement color = driver.findElement(By.id("color_24"));
		clickelement(color);
		
		sleep(1000);
		WebElement cart1 = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		clickelement(cart1);
		
		sleep(5000);
		WebElement check = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickelement(check);
		
		sleep(3000);
		WebElement check2 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		clickelement(check2);
		
		sleep(3000);
		WebElement check3 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		clickelement(check3);
		
		sleep(1000);
		WebElement box = driver.findElement(By.id("cgv"));
		clickelement(box);
		
		sleep(1000);
		WebElement check4 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickelement(check4);
		
		sleep(1000);
		WebElement payment = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		clickelement(payment);
		
		sleep(1000);
		WebElement order = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
		clickelement(order);
		
		WebElement down5 = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		scroll(down5);
		
	}
}
