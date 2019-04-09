package com.corejava.prop;

import java.util.Objects;
import java.util.Properties;

import com.corejava.utility.PropertyLoaderUtil;

public class PropertyUtil {
	
	private static Properties props = null;
	
	static {
		props = PropertyLoaderUtil.loadPackageProperties("/prop/data.properties");
	}
	
	public static String getProperty(String propName) {
		Objects.requireNonNull(propName);
		Objects.requireNonNull(props);
		return props.getProperty(propName);		
	}

}
