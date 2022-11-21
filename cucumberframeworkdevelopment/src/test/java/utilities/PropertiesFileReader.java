package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileReader {

	public Properties getproperty() {
		FileInputStream inputstream=null;
		Properties properties=new Properties();
		try {
			properties.load(new FileInputStream("resources/testdataexcel-config.properties"));
		}catch (Exception e){
			System.out.println("Exception:"+ e);
		}
		return properties;
	}
}
