package com.vtsrise.test;

import org.junit.Test;

import com.vtsrise.impl.StringArray;

import junit.framework.Assert;

public class StringArrayTest {
	
	@Test
	public void test1() {
		StringArray st = new StringArray();
		st.findMissing("AXBY", "ZERABXY");
	}
	
	@Test
	public void test2() {
		StringArray st = new StringArray();
		st.findMissing("AXBYM", "ZERABXY");
	}
	
	@Test
	public void test3() {
		StringArray st = new StringArray();
		st.findMissing("", "ZERABXY");
	}
	
	@Test
	public void test4() {
		StringArray st = new StringArray();
		st.findMissing("", "");
	}
}
