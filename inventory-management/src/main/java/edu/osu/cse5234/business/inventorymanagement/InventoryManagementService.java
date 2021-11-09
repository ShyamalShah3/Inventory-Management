package edu.osu.cse5234.business.inventorymanagement;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;

import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;

@Path("inventory")
public class InventoryManagementService {
	
	private Inventory currentInventory;
	private HttpClient client;
	private String localInventory = "http://localhost:5001/cartsdotcom/us-central1/inventory";
	//private String cloudInventory = "https://us-central1-cartsdotcom.cloudfunctions.net/inventory/functions/getAllitems";
	@GET
	@Path("getInventory")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInventory() {
		this.currentInventory = new Inventory();
		ArrayList<Item> items = new ArrayList<Item>();
		this.client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(localInventory))
				.GET()
				.build();
		try {
			HttpResponse<String> response = this.client.send(request, BodyHandlers.ofString());
			String result = response.body();
			JSONArray json = JSONArray.parse(result);
			for (int i = 0; i < json.size(); i++) {
				JSONObject temp = (JSONObject)json.get(i);
				String id = (String)temp.get("id");
				String name = (String)temp.get("name");
				String description = (String)temp.get("description");
				double price = Double.parseDouble(temp.get("price").toString());
				String url = ((String)temp.get("imageUrl")).replace("\\", "");
				int quantity = Integer.parseInt(temp.get("quantity").toString());
				items.add(new Item(id, name, description, price, url, quantity));
				
			}
			System.out.println("poop");
			
		}catch (Exception e) {
			System.out.println("Failed");
		}

		this.currentInventory.setItemList(items);
		return Response.ok(this.currentInventory).header("Access-Control-Allow-Origin", "*").build();
	}
	@GET
	@Path("ID/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)

	public Response getItemByID(@PathParam("String")String id) {
		this.getInventory();
		List<Item> items = this.currentInventory.getItemList();
		
		int i= 0;
		while(i<items.size()&&(items.get(i).getPid()!= id) ) {
			i++;
		}
		if(items.get(i).getPid()== id) {
			return Response.ok(items.get(i)).header("Access-Control-Allow-Origin", "*").build();
		}else {
			return null;
		}
		
	}
	@GET
	@Path("name")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getItemByName(@QueryParam("name") String name) {
		this.getInventory();
		List<Item> items = this.currentInventory.getItemList();
		int i= 0;
		boolean find=false;
		while( i<items.size()&& !(find=(items.get(i).getName().equals(name)))) {
			i++;
		}

		if(find) {
			return Response.ok(items.get(i)).header("Access-Control-Allow-Origin", "*").build();
		}else {
			return null;
		}
		
}
		
}
