package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;
import com.internousdev.ecsite2.util.DateUtil;

public class UserCreateCompleteDAO {
	public void createUser(String loginUserId, String loginPassword, String userName)throws SQLException{
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	DateUtil du = new DateUtil();

	String sql = "insert into login_user_transaction(login_id,login_pass,user_name,insert_date)values(?,?,?,?)";
	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, loginUserId);
		ps.setString(2, loginPassword);
		ps.setString(3, userName);
		ps.setString(4, du.getDate());

		ps.execute();
	}catch(SQLException e){
		e.printStackTrace();
	}try{
		con.close();
	}catch(SQLException e){
		e.printStackTrace();
	}

	}

}
