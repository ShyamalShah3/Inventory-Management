package com.chase.payment;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("credit-card-processing")
public class CreditCardProcessingService {
	@POST
	@Path("payment")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public String submitOrder(String pInfo) {
		JsonReader jsonR = Json.createReader(new StringReader(pInfo));
		JsonObject json = jsonR.readObject();
		PaymentInfo paymentInfo = new PaymentInfo(json.get("cardName").toString(), json.get("cardNum").toString(), json.get("expiration").toString(), json.get("cvv").toString());
		System.out.println("Order received from customer: \n" + paymentInfo);
		String result = "1001";
		return result;
	}
}
