package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite2.dto.UserListDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class UserListDAO {

	List<UserListDTO>userDTOList = new ArrayList<UserListDTO>();

	public List<UserListDTO> selectUserInfo(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();


		String sql = "select * from login_user_transaction";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				UserListDTO dto = new UserListDTO();
				dto.setUserId(rs.getInt("id"));
				dto.setLoginId(rs.getString("login_id"));
				dto.setLoginPass(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
				dto.setInsert_date(rs.getString("insert_date"));
				dto.setUpdated_date(rs.getString("updated_date"));
				dto.setAdminFlg(rs.getString("admin_flg"));
				userDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return userDTOList;
	}

}
