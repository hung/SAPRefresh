package sapconsole;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SAPConsole {

	static final Logger logger = LogManager.getLogger(SAPConsole.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			File f = new File(System.getProperty("java.class.path"));
		}
		catch (Exception ex) {
			logger.fatal("Cannot load setting file: " + ex.getMessage());
		}		
		showMenu();
	}

	private static void processRefresh(String SID) throws InterruptedException
	{
		
	}
	
	public static void showMenu()
	{
		System.out.println("Usage : java -jar SAPRefresh.jar JSONFILE");
		System.out.println();
		System.out.println("-------- Example --------");
		System.out.println("Testing : java -jar SAPRefresh.jar config.json");
		return;
	}

}
