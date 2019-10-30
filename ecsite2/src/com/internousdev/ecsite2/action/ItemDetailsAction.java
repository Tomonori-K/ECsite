package com.internousdev.ecsite2.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite2.dao.ItemDetailsDAO;
import com.internousdev.ecsite2.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDetailsAction extends ActionSupport{
	private int id;
	private List<ItemInfoDTO>itemInfoDTOList = new ArrayList<ItemInfoDTO>();

	public String execute(){
		String ret = SUCCESS;

		ItemDetailsDAO dao = new ItemDetailsDAO();
		itemInfoDTOList = dao.selectItemInfo(id);


		return ret;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public List<ItemInfoDTO> getItemInfoDTOList(){
		return itemInfoDTOList;
	}

	public void setItemInfoDTOList(List<ItemInfoDTO>itemInfoDTOList){
		this.itemInfoDTOList = itemInfoDTOList;
	}

}
