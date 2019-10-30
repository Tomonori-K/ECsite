package com.internousdev.ecsite2.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite2.dao.UserDetailsDAO;
import com.internousdev.ecsite2.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserDetailsAction extends ActionSupport{
	private List<UserInfoDTO>userInfoDTOList = new ArrayList<UserInfoDTO>();
	private String loginId;
	String ret;

	private String id;

	public String execute(){
		ret = SUCCESS;
		UserDetailsDAO dao = new UserDetailsDAO();
		userInfoDTOList = dao.selectUserInfo(id);

		return ret;
	}


	public String getLoginId(){
		return loginId;
	}

	public void setLoginId(String loginId){
		this.loginId = loginId;
	}

	public List<UserInfoDTO>getUserInfoDTOList(){
		return userInfoDTOList;
	}

	public void setUserInfoDTOList(List<UserInfoDTO>userInfoDTOList){
		this.userInfoDTOList = userInfoDTOList;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}
}
