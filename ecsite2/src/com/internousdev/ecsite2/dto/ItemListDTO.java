package com.internousdev.ecsite2.dto;

public class ItemListDTO {
	private int itemId;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	private String insert_date;
	private String update_date;

	public int getItemId(){
		return itemId;
	}

	public void setItemId(int itemId){
		this.itemId = itemId;
	}

	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public int getItemPrice(){
		return itemPrice;
	}

	public void setItemPrice(int itemPrice){
		this.itemPrice = itemPrice;
	}

	public int getItemStock(){
		return itemStock;
	}

	public void setItemStock(int itemStock){
		this.itemStock = itemStock;
	}

	public String getInsert_date(){
		return insert_date;
	}

	public void setInsert_date(String insert_date){
		this.insert_date = insert_date;
	}

	public String getUpdate_date(){
		return update_date;
	}

	public void setUpdate_date(String update_date){
		this.update_date = update_date;
	}

}
