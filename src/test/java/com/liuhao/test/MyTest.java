package com.liuhao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.liuhao.util.DateUtil;

public class MyTest {


	     @SuppressWarnings("static-access")
		public static void main(String[] args) {
			
	    	 
	    	 DateUtil dateUtil = new DateUtil();
	    	 
	    	 Date end = dateUtil.getDateByFullMonth(new Date());
	    	 
	    	 Date start = dateUtil.getDateByInitMonth(new Date());
	    	 
	    	 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    	 
	    	 String sql = "select * from t_order where create_time>='"+format.format(start)+"' and create_time<='"+format.format(end)+"' ";
	    	 System.err.println(sql);
		}
}
