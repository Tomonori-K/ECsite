package com.internousdev.ecsite2.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserDeleteConfirmAction extends ActionSupport{
	String ret = ERROR;
	String loginId;
	public String execute(){
		ret = SUCCESS;
		return ret;
	}

	public String getLoginId(){
		return loginId;
	}

	public void setLoginId(String loginId){
		this.loginId = loginId;
	}
}
