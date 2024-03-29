package com.internousdev.ecsite2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.UserCreateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String userName;
	private Map<String, Object>session;
	private String errorMessage;


	UserCreateDAO userCreateDAO = new UserCreateDAO();



	public String execute(){
		String ret = SUCCESS;

		if(loginUserId.equals(userCreateDAO.selectCheck(loginUserId))){
			setErrorMessage("すでに登録されているログインＩＤです。");
			ret = ERROR;
		}
		else if(!(loginUserId.equals(""))
			&&!(loginPassword.equals(""))
			&&!(userName.equals(""))){
			session.put("loginUserId",loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("userName", userName);
		}else{
			setErrorMessage("未入力の項目があります。");
			ret = ERROR;
		}
		return ret;
	}

	public String getLoginUserId(){
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getErrorMessage(){
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

	public Map<String, Object>getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object>session){
		this.session = session;
	}


}
