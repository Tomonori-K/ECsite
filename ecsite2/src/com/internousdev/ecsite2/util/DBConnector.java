package com.internousdev.ecsite2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/template666";
	private static String user = "root";
	private static String password = "mysql";

	public Connection getConnection(){
		Connection con = null;
		try{
		Class.forName(driverName);
		con = DriverManager.getConnection(url,user,password);
	}catch(SQLException e){
		e.printStackTrace();
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}
		return con;
	}
}
