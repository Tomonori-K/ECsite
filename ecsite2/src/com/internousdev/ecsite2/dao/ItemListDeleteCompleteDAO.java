package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;;

public class ItemListDeleteCompleteDAO {

	int i = 0;

	public int deleteItemInfo(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "delete from item_info_transaction";
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
