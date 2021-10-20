package edu.osu.cse5234.business.OrderProcessing;

import java.util.ArrayList;
import java.util.List;


public class Order {
private List<Item> items;
	public Order() {
		this.items = new ArrayList<Item>();
		
	}
	public List<Item> getOrderList() {
		return items;
	}

	public void setItemList(List<Item> itemList) {
		this.items = itemList;
	}


}
