package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;
import com.internousdev.ecsite2.util.DateUtil;
;

public class BuyItemCompleteDAO {

	public int buyItemInfo(String item_transaction_id, String total_price, String total_count, String user_master_id, String pay)throws SQLException{

		int ret = 0;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		DateUtil du = new DateUtil();
		String sql = "insert into user_buy_item_transaction(item_transaction_id,total_price,total_count,user_master_id,pay,insert_date)values(?,?,?,?,?,?)";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, total_price);
			ps.setString(3, total_count);
			ps.setString(4, user_master_id);
			ps.setString(5, pay);
			ps.setString(6, du.getDate());
			ret = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return ret;
	}

	public void itemStockUpdate(int count, String id){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		DateUtil du = new DateUtil();

		String sql = "update item_info_transaction set item_stock = item_stock - ? , update_date = ? where id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);


			ps.setInt(1, count);
			ps.setString(2, du.getDate());
			ps.setString(3, id);

			int result;
			result = ps.executeUpdate();
			if(result > 0){
				System.out.println(count + "個在庫が減りました");
			}else{
				System.out.println("更新に失敗しました");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

	}

}
