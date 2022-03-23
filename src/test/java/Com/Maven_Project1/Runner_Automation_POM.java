package Com.Maven_Project1;

import org.openqa.selenium.WebDriver;

public class Runner_Automation_POM extends Base_Class_Automation{
	
	public static WebDriver driver=browserconfiguration("chrome");
	
	public static Login_page lp = new Login_page(driver);
	
	public static Dress_1 d1 = new Dress_1(driver);
	
	public static Dress_2 d2 = new Dress_2(driver);
	
	public static Dress_3 d3 = new Dress_3(driver);
	
	public static Dress_4 d4 = new Dress_4(driver);
	
	public static Dress_CO1 c1 = new Dress_CO1(driver);
	
	public static Dress_CO2 c2 = new Dress_CO2(driver);
	
	public static Dress_CO3 c3 = new Dress_CO3(driver);
	
	public static Dress_CO4 c4 = new Dress_CO4(driver);
	
	public static Dress_Payment dp = new Dress_Payment(driver);
	
	public static void main(String[]args) throws InterruptedException {
	
	geturl("http://automationpractice.com/index.php?controller=authentication&back=my-account");	
	
	inputvalue(lp.getEmail(),"dineshbemech@gmail.com");
	
	inputvalue(lp.getPwd(),"8072935442");
	
	clickelement(lp.getBtn());
	
	sleep(1000);
	
	hover(d1.getDrs1());
	
	clickelement(d1.getDrs2());
	
	sleep(2000);

	clickelement(d2.getDrs1());
	
	scroll(d2.getDrs2());

	sleep(2000);
	
	clickelement(d3.getDrs1());
	
	sleep(1000);
	
	clickelement(d3.getDrs2());
	
	dropdown("byText", d3.getDrs3(),"L");
	
	clickelement(d3.getDrs4());

	clickelement(d4.getDrs1());
	
	sleep(2000);

	clickelement(c1.getCheck1());
	
	sleep(2000);
	
	clickelement(c2.getCheck());

	clickelement(c3.getCheck());

	clickelement(c4.getCheckbox());
	
	clickelement(c4.getCheck2());

	sleep(2000);
	
	clickelement(dp.getPaymnt());
	
	clickelement(dp.getPaymnt2());
	
	clickelement(dp.getPaymnt3());
	
	driver.close();

	}

}
