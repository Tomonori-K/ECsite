package com.internousdev.ecsite2.action;

import com.internousdev.ecsite2.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class userTestAction extends ActionSupport{
	public String execute(){
		String ret = ERROR;
		ItemListDeleteCompleteDAO dao = new ItemListDeleteCompleteDAO();
		int i = dao.deleteItemInfo();
		if(i > 0){
			ret = SUCCESS;
		}
		return ret;
	}

}