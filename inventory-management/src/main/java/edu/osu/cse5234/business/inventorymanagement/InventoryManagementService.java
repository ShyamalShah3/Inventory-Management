package edu.osu.cse5234.business.inventorymanagement;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("inventory")
public class InventoryManagementService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInventory() {
		Inventory currentInventory = new Inventory();
		ArrayList<Item> items = new ArrayList<Item>();
		items.add( new Item(1, "Two-Tier Cart", "This is a two tier shopping cart.", 100.0, "https://m.media-amazon.com/images/I/61COlmcV7yL._SL1000_.jpg", 2000));
		items.add( new Item(2, "Heavy Duty Small Cart", "This is a small heavy duty metal shopping cart.", 190.5, "https://cdna3.zoeysite.com/Adzpo594RQGDpLcjBynL1z/cache=expiry:31536000//auto_image/compress/https://s3.amazonaws.com/zcom-media/sites/a0i0L00000TM7fPQAT/media/catalog/product/s/m/small-metal-shopping-cart-angle.jpg", 2000) );
		items.add( new Item(3, "Liquor Store Cart", "This is a modern Liquor Store Cart.", 130, "https://cdna3.zoeysite.com/Adzpo594RQGDpLcjBynL1z/cache=expiry:31536000//auto_image/compress/https://s3.amazonaws.com/zcom-media/sites/a0i0L00000TM7fPQAT/media/catalog/product/m/o/modern-liquor-store-shopping-cart-30.gif.gif", 2000) );
		items.add( new Item(4, "Kids Miniature Shopping Cart", "This is a miniature shopping cart intended to be used by children.", 70.0, "https://m.media-amazon.com/images/I/410igDjak5L._AC_.jpg", 2000) );
		items.add( new Item(5, "Senior Shopping Cart", "This is a shoppping cart intended to be used by Seniors.", 120.0, "https://m.media-amazon.com/images/I/71HhPBwMYPL._AC_SL1500_.jpg", 2000) );
		items.add( new Item(6, "Bubbles", "Bubbles", 9000.0, "https://d31wcbk3iidrjq.cloudfront.net/kg2Hp-CYk_Screenshot_20170729-174311.jpg", 2000) );
		currentInventory.setItemList(items);
		return Response.ok(currentInventory).header("Access-Control-Allow-Origin", "*").build();
	}
	
	public Response getItemByID(int id) {
		Response r = this.getInventory();
		Inventory test = r.readEntity(Inventory.class);
		List<Item> items = test.getItemList();
		
		int i= 0;
		boolean find=false;
		while(find=(items.get(i).getPid()!= id) && items.size()<i) {
			i++;
		}
		
		if(find) {
			return Response.ok(items.get(i)).header("Access-Control-Allow-Origin", "*").build();
		}else {
			return null;
		}
		
}
	public Response getItemByName(String name) {
		Response r = this.getInventory();
		Inventory test = r.readEntity(Inventory.class);
		List<Item> items = test.getItemList();
		
		int i= 0;
		boolean find=false;
		while(find=(items.get(i).getName()!= name) && items.size()<i) {
			i++;
		}
		
		if(find) {
			return Response.ok(items.get(i)).header("Access-Control-Allow-Origin", "*").build();
		}else {
			return null;
		}
		
}
		
}
