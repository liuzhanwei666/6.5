package com.liuzhanwei.common.utils;

import java.util.Date;

/**
 * 
 * @ClassName: DateUtil
 * @Description: 日期处理
 * @author: 刘战威
 * @date: 2020年6月5日 下午2:20:56
 */
public class DateUtil {

	public static Date getDateByInitMonth(Date src) {
		int i = src.getMonth();
		i=i+1;
		int i1 = src.getYear();
		int i2 = src.getDate();
		i2=i2-4;
		return src;
	}

	public static Date getDateByFullMonth(Date src) {
		
		return src;
	}
}
