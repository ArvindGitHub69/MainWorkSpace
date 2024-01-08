package org.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

	public static Properties prop;
	private static String configpath = "ConfigFolder/Configuration_properties";
	
	public static void init() {
		prop = new Properties();
		try {
			InputStream in = new FileInputStream(configpath);
			prop.load(in);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
