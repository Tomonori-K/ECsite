package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;;

public class UserListDeleteCompleteDAO {



	public int deleteUserInfo(){
		int i = 0;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "delete from login_user_transaction　where admin_flg != '1' ";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			i = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return i;
	}

}
