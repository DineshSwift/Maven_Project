package Com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import Com.Maven_Project1.Base_Class_adactin;
import Com.POM_Adactin.Booking_page;
import Com.POM_Adactin.Booking_page1;
import Com.POM_Adactin.Final_page;
import Com.POM_Adactin.Final_page1;
import Com.POM_Adactin.Hotel_selection;
import Com.POM_Adactin.Login_page1;
import Com.POM_Manager.Page_Object_Manager;

public class Adactin extends Base_Class_adactin{
	
public static WebDriver driver=browserconfiguration("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main (String[]args) throws InterruptedException {
	
	geturl("https://adactinhotelapp.com/index.php");
	
	sleep(2000);
	
	inputvalueelement(pom.get_Instance_lp1().getEmail(),"Dineshk17");
	
	inputvalueelement(pom.get_Instance_lp1().getPwd(),"Dinesh171094");
	
	clickonElement(pom.get_Instance_lp1().getLogin());
	
	dropdown("byText",pom.get_Instance_bp().getLoc(),"London");
	
	dropdown("byText",pom.get_Instance_bp().getHotl(), "Hotel Sunshine");
	
	dropdown("byText",pom.get_Instance_bp().getRoomty(),"Deluxe");
	
	dropdown("byText",pom.get_Instance_bp().getRoom(), "3 - Three");

	sleep(2000);
	
	clearelement(pom.get_Instance_bp1().getDate1());
	inputvalueelement(pom.get_Instance_bp1().getDate1(),"11/04/2022");
	
	clearelement(pom.get_Instance_bp1().getDate2());
	inputvalueelement(pom.get_Instance_bp1().getDate2(),"15/04/2022");
	
	dropdown("byIndex",pom.get_Instance_bp1().getAdult(),"2");
	
	dropdown("byvalue",pom.get_Instance_bp1().getChild(),"2");
	
	clickonElement(pom.get_Instance_bp1().getSearch());

	clickonElement(pom.get_Instance_hs().getBtn());
	
	clickonElement(pom.get_Instance_hs().getBtn1());
	
	inputvalueelement(pom.get_Instance_fp().getName1(),"DINESH");
	
	inputvalueelement(pom.get_Instance_fp().getName2(),"K");
	
	inputvalueelement(pom.get_Instance_fp().getAddrs(),"4-109 NETHAJI STREET,Madurai-625006");
	
	inputvalueelement(pom.get_Instance_fp().getCardno(),"9876543210123456");
	
	dropdown("byText",pom.get_Instance_fp().getCardtype(),"Master Card");
	
	dropdown("byvalue",pom.get_Instance_fp().getMonth(),"10");
	
	dropdown("byText",pom.get_Instance_fp().getYear(),"2022");
	
	inputvalueelement(pom.get_Instance_fp().getCvv(),"012");
		
	clickonElement(pom.get_Instance_fpp().getBook());
	
	sleep(7000);
	
	clickonElement(pom.get_Instance_fpp().getLast());

	}	

}
