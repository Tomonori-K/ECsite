package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;
import com.internousdev.ecsite2.util.DateUtil;

public class ItemCreateCompleteDAO {
	int i = 0;
	public int createItem(String itemName, String itemPrice, String itemStock){
		int intPrice =Integer.parseInt(itemPrice);
		int intStock =Integer.parseInt(itemStock);

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		DateUtil du = new DateUtil();

		String sql = "insert into item_info_transaction(item_name,item_price,item_stock,insert_date)values(?,?,?,?)";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, itemName);
			ps.setInt(2, intPrice);
			ps.setInt(3, intStock);
			ps.setString(4, du.getDate());
			i =ps.executeUpdate();
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
