package Com.Logger;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Properties_Configuration {
	
	static Logger log = Logger.getLogger(Properties_Configuration.class);
	
	public static void main(String[]args) {
		
		PropertyConfigurator.configure("log4j.properties");
		log.debug("Debug");

		log.info("info");
		
		log.warn("warning");
		
		log.error("error");
		
		log.fatal("fatal");

	}

}
