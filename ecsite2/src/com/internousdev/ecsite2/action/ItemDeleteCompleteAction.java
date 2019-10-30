package com.internousdev.ecsite2.action;

import com.internousdev.ecsite2.dao.ItemDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteCompleteAction extends ActionSupport{
	private int id;

	public String execute(){

		ItemDeleteCompleteDAO dao = new ItemDeleteCompleteDAO();
		dao.deleteItemInfo(id);

		String ret = SUCCESS;

		return ret;


	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

}
