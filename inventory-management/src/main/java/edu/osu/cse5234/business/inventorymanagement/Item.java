package edu.osu.cse5234.business.inventorymanagement;

public class Item {
	private int pid;
	private String name;
	private String description;
	private double price;
	private String url;
	private int quantity;
	
	public Item(int id, String name, String desc, double price, String url, int quantity) {
		this.pid = id;
		this.name = name;
		this.description = desc;
		this.price = price;
		this.quantity = quantity;
		this.url = url;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
