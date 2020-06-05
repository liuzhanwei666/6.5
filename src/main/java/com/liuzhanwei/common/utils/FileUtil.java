package com.liuzhanwei.common.utils;
/**
 * 
 * @ClassName: FileUtil 
 * @Description: 拓展名
 * @author: 刘战威
 * @date: 2020年6月5日 下午2:17:22
 */
public class FileUtil {
	public static String getExtendName(String fileName) {
		String string = fileName.substring(fileName.indexOf("."));
		return string;
	}
}
