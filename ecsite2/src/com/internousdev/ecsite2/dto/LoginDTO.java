package com.internousdev.ecsite2.dto;

public class LoginDTO {
	private String loginUserId;
	private String loginPassword;
	private String userName;
	private boolean Flg = false;
	private String adminFlg;

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
		this.loginPassword =loginPassword;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public boolean getFlg(){
		return Flg;
	}

	public void setFlg(boolean Flg){
		this.Flg = Flg;
	}

	public String getAdminFlg(){
		return adminFlg;
	}

	public void setAdminFlg(String adminFlg){
		this.adminFlg = adminFlg;
	}

}
