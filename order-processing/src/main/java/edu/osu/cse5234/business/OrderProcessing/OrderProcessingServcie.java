package edu.osu.cse5234.business.OrderProcessing;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("order")
public class OrderProcessingServcie {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response submitOrder(String jsonOrder) {
		Jsonb jsonb = JsonbBuilder.create();
		Order submittedOrder =jsonb.fromJson(jsonOrder, Order.class);
		System.out.println("Order received from customer: \n" + submittedOrder);
		String result = "1001";
		return Response.ok(result).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String ping() {
		return "100ms";
	}
}
