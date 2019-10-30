package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite2.dto.ItemListDTO;
import com.internousdev.ecsite2.util.DBConnector;


public class ItemListDAO {

	List<ItemListDTO>itemDTOList = new ArrayList<ItemListDTO>();

	public List<ItemListDTO> selectItemInfo(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();


		String sql = "select * from item_info_transaction";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				ItemListDTO dto = new ItemListDTO();
				dto.setItemId(rs.getInt("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getInt("item_price"));
				dto.setItemStock(rs.getInt("item_stock"));
				dto.setInsert_date(rs.getString("insert_date"));
				dto.setUpdate_date(rs.getString("update_date"));
				itemDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return itemDTOList;
	}


	/*Retrieves the value of the designated column in the current row
    * of this <code>ResultSet</code> object as
    * a <code>String</code> in the Java programming language.
    */

}
