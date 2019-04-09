package com.corejava.utility;

import static org.junit.Assert.*;

import java.util.Properties;

import org.junit.Test;

import com.corejava.utility.PropertyLoaderUtil;

 
public class PropertyLoaderTest {

	@Test
	public void testPackageProperties() {		
		Properties props = PropertyLoaderUtil.loadPackageProperties("data2.properties");
		assertNotNull(props);
		assertEquals("com.spring.message.HelloWorldMessageProvider", props.getProperty("provider.class"));
		 
	}
	
	@Test
	public void testResourceProperties() throws Exception {		
		Properties props = PropertyLoaderUtil.loadResourceProperties("prop2.properties");
		assertNotNull(props);
		assertEquals("com.spring.message.StandardOutMessageRenderer", props.getProperty("renderer.class2"));
		 
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullPointer() {
		Properties props = PropertyLoaderUtil.loadPackageProperties(null);
	}

}
