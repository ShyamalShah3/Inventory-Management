package edu.osu.cse5234.business.OrderProcessing;

public class Item {
	private int pId;
	private String pName;
	private String pDescription;
	private double price;
	private String url;
	private int quantity;
	
	public Item(int id, String name, String des, double price, String url, int q) {
		this.pId=id;
		this.pName = name;
		this.pDescription = des;
		this.price= price;
		this.url=url;
		this.quantity = q;
		
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpDescription() {
		return pDescription;
	}

	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
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
