package com.internousdev.ecsite2.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite2.dao.ItemListDAO;
import com.internousdev.ecsite2.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport{
	private List<ItemListDTO>itemDTOList =new ArrayList<ItemListDTO>();

	public String execute(){
		String ret = SUCCESS;
		ItemListDAO dao = new ItemListDAO();
		itemDTOList = dao.selectItemInfo();
		return ret;
	}

	public List<ItemListDTO> getItemDTOList(){
		return itemDTOList;
	}

	public void setItemDTOList(List<ItemListDTO>itemDTOList){
		this.itemDTOList = itemDTOList;
	}

}
