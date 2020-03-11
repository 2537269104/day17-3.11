package com.liuhao.util;

import java.io.File;

/**
 * 文件工具类
 * @author 刘浩
 *
 */
public class FileUtil {

	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
	*/
	public static String getExtendName(String fileName){
	//TODO 实现代码
		
	   String str = fileName.substring(fileName.lastIndexOf("."));
	   
	   System.out.println(str);
		
		
		
		return null;
	}
	
	public static void main(String[] args) {
		getExtendName("aaa.jpg");
	}
}
