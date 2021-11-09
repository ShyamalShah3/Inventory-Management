package edu.osu.cse5234.business.OrderProcessing;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
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
	@Path("postOrder")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public Response submitOrder(String jsonOrder) {
		JsonReader jsonR = Json.createReader(new StringReader(jsonOrder));
		JsonObject json = jsonR.readObject();
		//do stuff with read json object
		System.out.println(json);
		String result = "1001";
		return Response.ok(result).header("Access-Control-Allow-Origin", "*").build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String ping() {
		return "100ms";
	}
}
