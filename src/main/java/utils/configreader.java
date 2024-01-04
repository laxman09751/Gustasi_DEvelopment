package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configreader {
	public static Properties intiliazeProperties() {
		Properties prop = new Properties();
		File profile = new File(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(profile);
			prop.load(fis);
			prop.getProperty("browser");
		}
		catch(Throwable e){
			e.printStackTrace();
		}
		return prop;	
	}
}
