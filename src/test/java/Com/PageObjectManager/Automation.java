package Com.PageObjectManager;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import Com.Maven_Project1.Base_Class_Automation;
import Com.Maven_Project1.Dress_1;
import Com.Maven_Project1.Dress_2;
import Com.Maven_Project1.Dress_3;
import Com.Maven_Project1.Dress_4;
import Com.Maven_Project1.Dress_CO1;
import Com.Maven_Project1.Dress_CO2;
import Com.Maven_Project1.Dress_CO3;
import Com.Maven_Project1.Dress_CO4;
import Com.Maven_Project1.Dress_Payment;
import Com.Maven_Project1.Login_page;
import Com.POM_Manager.Page_Object_Manager_Automation;

public class Automation extends Base_Class_Automation {
		
		public static WebDriver driver=browserconfiguration("chrome");
		
		public static Page_Object_Manager_Automation pom1 = new Page_Object_Manager_Automation(driver);
		
		public static Logger log = Logger.getLogger(Automation.class);
		
		public static void main(String[]args) throws InterruptedException {
		
			PropertyConfigurator.configure("log4j.properties");
			
		geturl("http://automationpractice.com/index.php?controller=authentication&back=my-account");	
		
		log.info("URL Launch");
		
		inputvalue(pom1.get_Instance_lp().getEmail(),"dineshbemech@gmail.com");
		
		inputvalue(pom1.get_Instance_lp().getPwd(),"8072935442");
		
		clickelement(pom1.get_Instance_lp().getBtn());
		
		log.info("Valid Credentials Entered");
		
		sleep(1000);
		
		hover(pom1.get_Instance_d1().getDrs1());
		
		clickelement(pom1.get_Instance_d1().getDrs2());
		
		log.info("Dress Selected");
		
		sleep(2000);

		clickelement(pom1.get_Instance_d2().getDrs1());
		
		scroll(pom1.get_Instance_d2().getDrs2());

		sleep(2000);
		
		clickelement(pom1.get_Instance_d3().getDrs1());
		
		sleep(1000);
		
		clickelement(pom1.get_Instance_d3().getDrs2());
		
		dropdown("byText", pom1.get_Instance_d3().getDrs3(),"L");
		
		clickelement(pom1.get_Instance_d3().getDrs4());

		clickelement(pom1.get_Instance_d4().getDrs1());
		
		sleep(2000);

		clickelement(pom1.get_Instance_c1().getCheck1());
		
		sleep(2000);
		
		clickelement(pom1.get_Instance_c2().getCheck());

		clickelement(pom1.get_Instance_c3().getCheck());

		clickelement(pom1.get_Instance_c4().getCheckbox());
		
		clickelement(pom1.get_Instance_c4().getCheck2());

		sleep(2000);
		
		clickelement(pom1.get_Instance_dp().getPaymnt());
		
		clickelement(pom1.get_Instance_dp().getPaymnt2());
		
		clickelement(pom1.get_Instance_dp().getPaymnt3());
		
		driver.close();

		}

	}


