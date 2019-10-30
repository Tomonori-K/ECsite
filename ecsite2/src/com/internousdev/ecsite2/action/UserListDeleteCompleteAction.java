package com.internousdev.ecsite2.action;

import com.internousdev.ecsite2.dao.UserListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport{
	public String execute(){
		UserListDeleteCompleteDAO dao = new UserListDeleteCompleteDAO();
		int i = dao.deleteUserInfo();
		if(i > 0){
			System.out.println("削除に成功しました");
		}else if(i == 0){
			System.out.println("削除に失敗しました");
		}
		String ret = SUCCESS;

		return ret;
	}

}