package com.jlcindia.bookstore.util;
import java.sql.*;

import org.apache.commons.dbcp.BasicDataSource;


public class DataSourceUtil {
	public static Connection getConnection() {
		
		Connection con=null;
		
		try {
			 BasicDataSource bds=new BasicDataSource();
			 bds.setDriverClassName("com.mysql.jdbc.Driver");
			 bds.setUrl("jdbc:mysql://localhost:3306/myjlcbsDB");
			 bds.setUsername("root");
			 bds.setPassword("reddy");
			 bds.setInitialSize(10);
			 bds.setMaxActive(100);
			 
			 con=bds.getConnection();		 
			 
	}catch(Exception ex) {
		ex.printStackTrace();
	}
		return con;
	}
	public static void cleanUp(Statement st,Connection con) {
		try {
		
			if(st!=null)
				st.close();
			if(con!=null)
				con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void cleanup(ResultSet rs,Statement st,Connection con) {
		try {
			
			if(st!=null)
				st.close();
			if(con!=null)
				con.close();
			if(rs!=null)
				rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	} 
}
