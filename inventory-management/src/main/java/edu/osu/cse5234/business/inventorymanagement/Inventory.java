package edu.osu.cse5234.business.inventorymanagement;

import java.util.ArrayList;

public class Inventory {

	private ArrayList<Item> itemList;
	
	public Inventory() {
		this.itemList = new ArrayList<Item>();
	}

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}
	public Response getItemById(int id) {
	
		int i= 0;
		boolean find=false;
		while(find=(this.itemList.get(i).getpId()!= id) && this.itemList.size()<i) {
			i++;
		}
		
		if(find) {
			return Response.ok(this.itemList.get(i)).header("Access-Control-Allow-Origin", "*").build();
		}else {
			return null;
		}
		
		
	}
	public Response getItemByName(String name) {

		int i= 0;
		boolean find=false;
		while(find=(this.itemList.get(i).getpName()!= name) && this.itemList.size()<i) {
			i++;
		}
		
		if(find) {
			return Response.ok(this.itemList.get(i)).header("Access-Control-Allow-Origin", "*").build();
		}else {
			return null;
		}
		
}
}
