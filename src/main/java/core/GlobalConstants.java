package core;


import org.testng.annotations.Test;

@Test
public class GlobalConstants {
	public static String BROWSER = browse();
	 public static String browse(){
	  	String default_browser = "chrome";
	 	try{
			if(!System.getProperty("browser").equals(null)){
			  	BROWSER = System.getProperty("browser").toString();
			  	} 	
			  	}catch(NullPointerException e){
			  		BROWSER = default_browser;
			  	}catch(ExceptionInInitializerError e){
			  		BROWSER = default_browser;	
			  	}
			return BROWSER;
			}
	 public static String country = site(); 
		public static String site(){
	        String defaultSite = "http://staging-maklarservice.cortexcraft.com/";
		    return defaultSite;
		}
		public static String baseUrl = "http://staging-maklarservice.cortexcraft.com/";		
		public static String AdminBaseUrl="http://staging-maklarservice.cortexcraft.com/";
		public static String NavigationUrl="http://staging-maklarservice.cortexcraft.com/";
		public static String CHROMEpATH = "C:\\chromedriver.exe";
		
}
