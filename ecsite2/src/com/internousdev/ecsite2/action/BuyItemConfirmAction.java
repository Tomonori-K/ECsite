package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{
	private Map<String, Object>session;
	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();

	public String execute() throws SQLException{
		int i = buyItemCompleteDAO.buyItemInfo(
				session.get("id").toString(),
				session.get("total_price").toString(),
				session.get("count").toString(),
				session.get("login_user_id").toString(),
				session.get("pay").toString());
		if(i > 0){
		buyItemCompleteDAO.itemStockUpdate(Integer.parseInt(session.get("count").toString()), session.get("id").toString());
		}
		String result = SUCCESS;
		return result;
	}

	public Map<String, Object>session(){
		return session;
	}

	public void setSession(Map<String,Object>session){
		this.session = session;
	}

}
