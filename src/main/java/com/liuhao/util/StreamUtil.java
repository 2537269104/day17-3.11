package com.liuhao.util;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

/**
 * 流处理工具类
 * @author 刘浩
 *
 */
public class StreamUtil {

	
	
	/*
	* 方法1：批量关闭流，参数能传入无限个。(10分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	*/
	public static void closeAll(Closeable ...closeables){
	//TODO 实现代码
		for (Closeable closeable : closeables) {
			if(closeable!=null) {
				
				try {
					closeable.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
	*/
	public static String readTextFile(InputStream src) throws IOException{
	//TODO 实现代码
		
	    byte [] b = new byte[1024];  
	    int len =0;
	    String string = "";
		while((len=src.read())!=-1) {
			 string+=(char)(len);
		}
		
		return string;
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile){
	//TODO 实现代码
		InputStream input =null;
		String textFile = null;
		
		try {
			input = new FileInputStream(txtFile);
			
			 textFile = readTextFile(input);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			closeAll(input);
		}
		
		return textFile;
	}
	
	public static void main(String[] args) {
		
		/*
		 * InputStream input =null; try { input = new FileInputStream(new
		 * File("C:\\Users\\25372\\Desktop\\CMS配置文件\\web.xml"));
		 * 
		 * String readTextFile = readTextFile(input);
		 * 
		 * System.out.println(readTextFile); } catch (Exception e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } finally { closeAll(input);
		 * }
		 */
		
		String readTextFile = readTextFile(new File("C:\\Users\\25372\\Desktop\\CMS配置文件\\web.xml"));
		System.err.println(readTextFile);
	}
}
