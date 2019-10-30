package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite2.dto.ItemInfoDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class ItemDetailsDAO {

	private List<ItemInfoDTO>itemInfoDTOList = new ArrayList<ItemInfoDTO>();

	public List<ItemInfoDTO> selectItemInfo(int id){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();


		String sql = "select * from item_info_transaction where id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				ItemInfoDTO dto = new ItemInfoDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getString("item_price"));
				dto.setItemStock(rs.getString("item_stock"));
				dto.setInsert_date(rs.getString("insert_date"));
				dto.setUpdate_date(rs.getString("update_date"));
				itemInfoDTOList.add(dto);

			}
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return itemInfoDTOList;
	}

	public List<ItemInfoDTO> getItemInfoDTOList(){
		return itemInfoDTOList;
	}

	public void setItemInfoDTOList(List<ItemInfoDTO>itemInfoDTOList){
		this.itemInfoDTOList = itemInfoDTOList;
	}

}
