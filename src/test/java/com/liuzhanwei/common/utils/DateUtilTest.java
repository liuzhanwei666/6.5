package com.liuzhanwei.common.utils;


import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@SuppressWarnings("deprecation")
	@Test
	public void getDateByInitMonth() {

		Date date = new Date();
		int i = date.getMonth();
		i=i+1;
		int i1 = date.getYear();
		int i2 = date.getDate();
		i2=i2-4;
		System.out.println(i1+"-"+i+"-"+i2);
		
	}

}
