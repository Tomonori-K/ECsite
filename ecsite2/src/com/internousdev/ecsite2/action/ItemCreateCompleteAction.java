package com.internousdev.ecsite2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{

	private Map<String, Object>session;

	public String execute(){
		String ret = ERROR;
		ItemCreateCompleteDAO dao = new ItemCreateCompleteDAO();
		int i = dao.createItem(
				session.get("itemName").toString(),
				session.get("itemPrice").toString(),
				session.get("itemStock").toString());
		if(i > 0){
			ret = SUCCESS;
		}else{
			ret = ERROR;
		}
		return ret;
	}

	public Map<String,Object>getSession(){
		return session;
	}

	public void setSession(Map<String, Object>session){
		this.session = session;
	}

}
