package Com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import Com.Maven_Project1.Base_Class_adactin;
import Com.POM_Adactin.Booking_page;
import Com.POM_Adactin.Booking_page1;
import Com.POM_Adactin.Final_page;
import Com.POM_Adactin.Final_page1;
import Com.POM_Adactin.Hotel_selection;
import Com.POM_Adactin.Login_page1;

public class Runner_Adactin_POM extends Base_Class_adactin{
	
	public static WebDriver driver=browserconfiguration("chrome");
	
	public static Login_page1 lp1 = new Login_page1(driver);
	
	public static Booking_page bp = new Booking_page(driver);
	
	public static Booking_page1 bp1=new Booking_page1(driver);
	
	public static Hotel_selection hs = new Hotel_selection(driver);
	
	public static Final_page fp = new Final_page(driver);
	
	public static Final_page1 fpp = new Final_page1(driver);
	
	public static void main (String[]args) throws InterruptedException {
	
	geturl("https://adactinhotelapp.com/index.php");
	
	sleep(2000);
	
	inputvalueelement(lp1.getEmail(),"Dineshk17");
	
	inputvalueelement(lp1.getPwd(),"Dinesh171094");
	
	clickonElement(lp1.getLogin());
	
	dropdown("byText",bp.getLoc(),"London");
	
	dropdown("byText",bp.getHotl(), "Hotel Sunshine");
	
	dropdown("byText",bp.getRoomty(),"Deluxe");
	
	dropdown("byText",bp.getRoom(), "3 - Three");

	sleep(2000);
	
	clearelement(bp1.getDate1());
	inputvalueelement(bp1.getDate1(),"11/04/2022");
	
	clearelement(bp1.getDate2());
	inputvalueelement(bp1.getDate2(),"15/04/2022");
	
	dropdown("byIndex",bp1.getAdult(),"2");
	
	dropdown("byvalue", bp1.getChild(),"2");
	
	clickonElement(bp1.getSearch());

	clickonElement(hs.getBtn());
	
	clickonElement(hs.getBtn1());
	
	inputvalueelement(fp.getName1(),"DINESH");
	
	inputvalueelement(fp.getName2(),"K");
	
	inputvalueelement(fp.getAddrs(),"4-109 NETHAJI STREET,Madurai-625006");
	
	inputvalueelement(fp.getCardno(),"9876543210123456");
	
	dropdown("byText",fp.getCardtype(),"Master Card");
	
	dropdown("byvalue",fp.getMonth(),"10");
	
	dropdown("byText",fp.getYear(),"2022");
	
	inputvalueelement(fp.getCvv(),"012");
		
	clickonElement(fpp.getBook());
	
	sleep(7000);
	
	clickonElement(fpp.getLast());

	}

}
