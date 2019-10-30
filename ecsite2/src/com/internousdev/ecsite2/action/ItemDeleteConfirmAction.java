package com.internousdev.ecsite2.action;

import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteConfirmAction extends ActionSupport{
	String id;
	public String execute(){

		String ret = SUCCESS;

		return ret;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}

}
