package Com.POM_Manager;

import org.openqa.selenium.WebDriver;

import Com.POM_Adactin.Booking_page;
import Com.POM_Adactin.Booking_page1;
import Com.POM_Adactin.Final_page;
import Com.POM_Adactin.Final_page1;
import Com.POM_Adactin.Hotel_selection;
import Com.POM_Adactin.Login_page1;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private Login_page1 lp1;
	
	private Booking_page bp;
	
	private Booking_page1 bp1;
	
	private Hotel_selection hs;
	
	private Final_page fp;
	
	private Final_page1 fpp;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}

	public Login_page1 get_Instance_lp1 () {
		
		if(lp1==null) {
			lp1=new Login_page1(driver);
		}
		return lp1;
	}
	
	public Booking_page get_Instance_bp() {
		
		{
			bp=new Booking_page(driver);
		}
		return bp;
	}
	
	public Booking_page1 get_Instance_bp1() {
		bp1=new Booking_page1(driver);
		return bp1; 
	}
	
	public Hotel_selection get_Instance_hs() {
		hs=new Hotel_selection(driver);
		return hs;
	}
	
	public Final_page get_Instance_fp() {
		fp=new Final_page(driver);
		return fp;
	}
	
	public Final_page1 get_Instance_fpp() {
		fpp=new Final_page1(driver);
		return fpp;
		
	}
	
	
	
	
	
	
	
	
	
	
}
