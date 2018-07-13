package USA_amaravathi;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerTest {

	
	
	final static Logger logger = Logger.getLogger(LoggerTest.class);
	public static void main(String[] args) {

		
		
		PropertyConfigurator.configure("log4j.properties");	
		logger.setLevel(Level.WARN);
		
		logger.debug("This is Debug");
		logger.info("This is info");
		logger.warn("This is warn");
		logger.error("This is error");
		logger.fatal("This is fatal");
	
		System.out.println("hi");
		 
		
	}

}
