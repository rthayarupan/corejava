package com.corejava;

import com.corejava.prop.PropertyUtil;
import com.corejava.utility.PropertyLoaderUtil;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println(PropertyUtil.getProperty("provider.class"));
		
	}

}
