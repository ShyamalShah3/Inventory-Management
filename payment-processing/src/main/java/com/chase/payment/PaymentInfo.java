package com.chase.payment;

/**
 * @author Shyamal Shah
 *
 */
public class PaymentInfo {
	private String cardName;
	private String cardNum;
	private String CVV;
	private String ExpirationDate;
	
	public PaymentInfo(String name,String number, String cvv, String expDate) {
		this.cardName = name;
		this.cardNum = number;
		this.CVV = cvv;
		this.ExpirationDate  = expDate;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getCVV() {
		return CVV;
	}

	public void setCVV(String cVV) {
		CVV = cVV;
	}

	public String getExpirationDate() {
		return ExpirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		ExpirationDate = expirationDate;
	}
	
	@Override
	public String toString() {
		return "Card Name: " + this.cardName + "\n" + "Card Number: " + this.cardNum + "\n" + "Expiration Date: " + this.ExpirationDate + "\n"
				+ "CVV: " + this.CVV;
	}
}
