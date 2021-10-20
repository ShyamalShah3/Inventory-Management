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


}
