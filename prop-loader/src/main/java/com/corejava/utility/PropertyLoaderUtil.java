package com.corejava.utility;

import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class PropertyLoaderUtil {

	/**
	 * package level: com/corejava/utility/data.properties
	 * resource: data.properties
	 */
	public static Properties loadResourceProperties(String fileName) throws Exception{
		Objects.requireNonNull(fileName);
		Properties prop = new Properties();		
		try(InputStream in = PropertyLoaderUtil.class.getClassLoader().getResourceAsStream(fileName)){
			if(in!=null) {
				prop.load(in);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return prop;
	}
	
	/**
	 * package level: /com/corejava/utility/data.properties
	 * resource: /data.properties
	 */
	public static Properties loadPackageProperties(String fileName) {
		Objects.requireNonNull(fileName);
		Properties prop = new Properties();		
		try(InputStream in = PropertyLoaderUtil.class.getResourceAsStream(fileName)){
			if(in!=null) {
				prop.load(in);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return prop;
	}
 
}
