package edu.osu.cse5234.business.inventorymanagement;



public class Order {
	private Item item;
	private paymentInfo payment;
	private shippingInfo shipping;
	
	public Order(Item its, paymentInfo pay, shippingInfo ship) {
		this.item = its;
		this.payment = pay;
		this.shipping = ship;
		
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public paymentInfo getPayment() {
		return payment;
	}

	public void setPayment(paymentInfo payment) {
		this.payment = payment;
	}

	public shippingInfo getShipping() {
		return shipping;
	}

	public void setShipping(shippingInfo shipping) {
		this.shipping = shipping;
	}
}
