package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;

public class UserDeleteCompleteDAO {

	int count;

	public int deleteUserInfo(String loginId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "delete from login_user_transaction where login_id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginId);
			count = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}

}
