package com.liuhao.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 * @author 刘浩
 *
 */
public class DateUtil {
	/*
	* 方法1：(10分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
public static Date getDateByInitMonth(Date date){
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-01 00:00:00");
		String format = simpleDateFormat.format(date);
		System.out.println(format);
	
		try {
			Date date2 = simpleDateFormat.parse(format);
			return date2;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	* 方法2：(10分)
	* 给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date date){
	//TODO 实现代码
		
		 Calendar calendar = Calendar.getInstance();
		 
		 Date date1 = getDateByInitMonth(date);
		 
		 calendar.setTime(date1);
		 calendar.add(Calendar.MONTH, 1);
		 
		
		 calendar.add(Calendar.SECOND, -1);
		
		 
		 Date date2 = calendar.getTime();
		return  date2;
	}
	public static void main(String[] args) {
		
		Date date = getDateByFullMonth(new Date());
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = simpleDateFormat.format(date);
		System.out.println(format);
	}
	
}
