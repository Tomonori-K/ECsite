package com.internousdev.ecsite2.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite2.dao.UserListDAO;
import com.internousdev.ecsite2.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport{
	private List<UserListDTO>userDTOList = new ArrayList<UserListDTO>();
	public String execute(){
		String ret = SUCCESS;
		UserListDAO dao = new UserListDAO();
		userDTOList = dao.selectUserInfo();

		return ret;
	}

	public List<UserListDTO>getUserDTOList(){
		return userDTOList;
	}

	public void setUserDTOList(List<UserListDTO>userDTOList){
		this.userDTOList = userDTOList;
	}

}
