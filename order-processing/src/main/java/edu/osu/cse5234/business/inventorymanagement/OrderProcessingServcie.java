package edu.osu.cse5234.business.inventorymanagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("Order")
@Consumes(MediaType.APPLICATION_JSON)
public class OrderProcessingServcie {
	public Response submitOrder(String jsonOrder) {
		Jsonb jsonb = JsonbBuilder.create();
		Order submittedOrder =jsonb.fromJson(jsonOrder, Order.class);
		System.out.println("Order received from customer: \n" + submittedOrder);
		
		return Response.ok("1001").build();
	}
}
