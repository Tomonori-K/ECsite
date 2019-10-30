package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.MyPageDAO;
import com.internousdev.ecsite2.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{
	private Map<String,Object>session;
	private MyPageDAO myPageDAO = new MyPageDAO();
	private List<MyPageDTO>myPageDTOList = new ArrayList<MyPageDTO>();
	private String deleteFlg;
	private String message;

	public String execute()throws SQLException{
		if(!session.containsKey("login_user_id")){
			String ret = ERROR;
			return ret;
		}
		if(deleteFlg == null){
			String item_transaction_id = session.get("id").toString();
			String user_master_id = session.get("login_user_id").toString();
			myPageDTOList = myPageDAO.getMyPageUserInfo(item_transaction_id, user_master_id);

		}else if (deleteFlg.equals("1")){
			delete();
		}
		String ret = SUCCESS;
		return ret;

	}

	public  void delete()throws SQLException{
		String item_transaction_id = session.get("id").toString();
		String user_master_id = session.get("login_user_id").toString();

		int res = myPageDAO.buyItemHistoryDelete(item_transaction_id, user_master_id);
		if(res > 0){
			myPageDTOList = null;
			setMessage("商品情報を削除しました。");
		}else if(res == 0){
			setMessage("商品情報の削除に失敗しました。");
		}

	}

	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg = deleteFlg;
	}

	public List<MyPageDTO>getMyPageDTOList(){
		return myPageDTOList;
	}

	public String getMessage(){
		return message;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public Map<String, Object>getSession(){
		return this.session;
	}
	@Override
	public void setSession(Map<String, Object>session){
		this.session = session;
	}


}
