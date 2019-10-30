package com.internousdev.ecsite2.dto;

public class UserListDTO {
	private int userId;
	private String loginId;
	private String loginPass;
	private String userName;
	private String insert_date;
	private String updated_date;
	private String adminFlg;

	public int getUserId(){
		return userId;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public String getLoginId(){
		return loginId;
	}

	public void setLoginId(String loginId){
		this.loginId = loginId;
	}

	public String getLoginPass(){
		return loginPass;
	}

	public void setLoginPass(String loginPass){
		this.loginPass = loginPass;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getInsert_date(){
		return insert_date;
	}

	public void setInsert_date(String insert_date){
		this.insert_date = insert_date;
	}

	public String getUpdated_date(){
		return updated_date;
	}

	public void setUpdated_date(String updated_date){
		this.updated_date = updated_date;
	}

	public String getAdminFlg(){
		return adminFlg;
	}

	public void setAdminFlg(String adminFlg){
		this.adminFlg = adminFlg;
	}

}
