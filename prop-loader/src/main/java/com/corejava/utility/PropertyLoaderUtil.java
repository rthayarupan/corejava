package com.corejava.utility;

import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class PropertyLoaderUtil {

	public static Properties loadResourceProperties(String fileName) throws Exception{
		Objects.requireNonNull(fileName);
		Properties prop = new Properties();		
		try(InputStream in = PropertyLoaderUtil.class.getClassLoader().getResourceAsStream(fileName)){
			prop.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return prop;
	}
	
	public static Properties loadPackageProperties(String fileName) {
		Objects.requireNonNull(fileName);
		Properties prop = new Properties();		
		try(InputStream in = PropertyLoaderUtil.class.getResourceAsStream(fileName)){
			prop.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return prop;
	}
 
}
