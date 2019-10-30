package com.internousdev.ecsite2.action;

import com.internousdev.ecsite2.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport{
	public String execute(){
		ItemListDeleteCompleteDAO dao = new ItemListDeleteCompleteDAO();
		int i = dao.deleteItemInfo();
		if(i > 0){
			System.out.println("削除に成功しました");
		}else if(i == 0){
			System.out.println("削除に失敗しました");
		}
		String ret = SUCCESS;

		return ret;
	}

}
