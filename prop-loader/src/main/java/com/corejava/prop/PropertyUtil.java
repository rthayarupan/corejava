package com.corejava.prop;

import java.util.Objects;
import java.util.Properties;

import com.corejava.utility.PropertyLoaderUtil;

public class PropertyUtil {
	
	private static Properties props = null;
	
	static {
		try {
			//props = PropertyLoaderUtil.loadResourceProperties("com/corejava/utility/data.properties");			
			props = PropertyLoaderUtil.loadPackageProperties("/prop.properties");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String propName) {
		Objects.requireNonNull(propName);
		Objects.requireNonNull(props);
		return props.getProperty(propName);		
	}

}
