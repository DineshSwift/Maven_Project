package Com.POM_Manager;

import org.openqa.selenium.WebDriver;

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

public class Page_Object_Manager_Automation {
	
	public WebDriver driver; 
	
	private Login_page lp;
	
	private Dress_1 d1;
	
	private Dress_2 d2;
	
	private Dress_3 d3;
	
	private Dress_4 d4;
	
	private Dress_CO1 c1;
	
	private Dress_CO2 c2;
	
	private Dress_CO3 c3;
	
	private Dress_CO4 c4;
	
	private Dress_Payment dp;
	
	public Page_Object_Manager_Automation(WebDriver driver2) {
		this.driver=driver2;
	}

	public Login_page get_Instance_lp() {
		
		if(lp==null) {
			
		lp=new Login_page(driver);
		}
		return lp;
	}
	
	public Dress_1 get_Instance_d1() {
		
		if(d1==null) {
			
			d1=new Dress_1(driver);
		}
		return d1;
	}
	
	public Dress_2 get_Instance_d2() {
		
		if(d2==null) {
			
			d2=new Dress_2(driver);
		}
		return d2;
	}
	
	public Dress_3 get_Instance_d3() {
		if(d3==null) {
			
			d3=new Dress_3(driver);
		}
		return d3;
	}
	
	public Dress_4 get_Instance_d4() {
		if(d4==null) {
			d4=new Dress_4(driver);
		}
		return d4;
	}

	public Dress_CO1 get_Instance_c1() {
		if(c1==null) {
			
			c1=new Dress_CO1(driver);
			
		}
		return c1;
	}
	
	public Dress_CO2 get_Instance_c2() {
		
		if(c2==null) {
			
			c2=new Dress_CO2(driver);
		}
		return c2;

	}
	
	public Dress_CO3 get_Instance_c3() {
		
		if(c3==null) {
			c3=new Dress_CO3(driver);
			}
		return c3;
	}
	
	public Dress_CO4 get_Instance_c4() {
		if(c4==null) {
			c4=new Dress_CO4(driver);
		}
		return c4;
	}
	
	public Dress_Payment get_Instance_dp() {
		if(dp==null) {
			dp=new Dress_Payment(driver);
		}
		return dp;
	}
}
