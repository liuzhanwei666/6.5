package com.liuzhanwei.common.utils;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		String string = "aaa.jpg";
		String string1 = string.substring(string.indexOf("."));
		System.out.println(string1);
	}

}
