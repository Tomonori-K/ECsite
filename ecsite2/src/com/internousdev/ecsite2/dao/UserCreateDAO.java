package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;

public class UserCreateDAO {
	String ret;

	public String selectCheck(String loginUserId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select login_id from login_user_transaction where login_id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				ret = rs.getString("login_id");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}return ret;
	}

}
