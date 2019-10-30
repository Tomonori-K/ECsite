package com.internousdev.ecsite2.action;

import com.internousdev.ecsite2.dao.UserDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserDeleteCompleteAction extends ActionSupport{
	String message;
	String loginId;

	public String execute(){
		UserDeleteCompleteDAO dao = new UserDeleteCompleteDAO();
		int i = dao.deleteUserInfo(loginId);
		String ret;
		if(i > 0){
			ret = SUCCESS;
			message = "削除に成功しました";
		}else{
			ret = ERROR;
			message = "削除に失敗しました";
		}

		return ret;
	}

	public String getLoginId(){
		return loginId;
	}

	public void setLoginId(String loginId){
		this.loginId = loginId;
	}

}
