package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite2.dto.UserInfoDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class UserDetailsDAO {

	private List<UserInfoDTO>userInfoDTOList = new ArrayList<UserInfoDTO>();

	public  List<UserInfoDTO> selectUserInfo(String id){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from login_user_transaction where id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				UserInfoDTO dto = new UserInfoDTO();
				dto.setId(rs.getString("id"));
				dto.setLoginId(rs.getString("login_id"));
				dto.setLoginPass(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
				dto.setInsert_date(rs.getString("insert_date"));
				dto.setUpdate_date(rs.getString("updated_date"));
				dto.setAdmin_flg(rs.getString("admin_flg"));
				userInfoDTOList.add(dto);
				if(userInfoDTOList.get(0).getLoginId() == null){
					userInfoDTOList = null;
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return userInfoDTOList;


	}

	public List<UserInfoDTO>getUserInfoDTOList(){
		return userInfoDTOList;
	}

	public void setUserInfoDTOList(List<UserInfoDTO>userInfoDTOList){
		this.userInfoDTOList = userInfoDTOList;
	}

}
