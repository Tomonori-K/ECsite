package com.internousdev.ecsite2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{
	private Map<String, Object>session;
	private int count;
	private String pay;
	private String errorMessage;

	public String execute(){

		String ret = SUCCESS;

		int itemStock = Integer.parseInt(session.get("buyItem_stock").toString());
		if(count > itemStock){
			ret =ERROR;
			errorMessage = "在庫が足りません";
			return ret;
		}

		session.put("count",count);
		int intCount = Integer.parseInt(session.get("count").toString());
		int intPrice = Integer.parseInt(session.get("buyItem_price").toString());
		session.put("total_price", intCount*intPrice);

		String payment;
		if(pay.equals("1")){
			payment="現金払い";
			session.put("pay", payment);
		}else{
			payment="クレジットカード払い";
			session.put("pay",payment);
		}
		return ret;
	}

	public Map<String,Object>getSession (){
		return session;
	}

	public void setSession(Map<String,Object>session){
		this.session = session;
	}

	public void setCount(int count){
		this.count = count;
	}

	public void setPay(String pay){
		this.pay = pay;
	}

	public String getPay(){
		return pay;
	}

	public String getErrorMessage(){
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

}
