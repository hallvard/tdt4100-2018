package of7;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	
	
	private Map<Item, Integer> cart = new HashMap<>();
	
	
	public void addItem(Item item, int amount) {
		if (!cart.containsKey(item)) {
			cart.put(item, amount);
		}
		else {
			cart.put(item, amount+getAmountItem(item)); 
		}
		item.addShoppingCart(this);
		
	}
	
	public int getAmountItem(Item item) {
		if(cart.containsKey(item)) {
			return cart.get(item); }
		return 0;
	}
	public double getItemPrice(Item item) {
		if(cart.containsKey(item)) {
			return item.getPrice()*getAmountItem(item); 
		}
		return 0; 
	}
	
	public double getCartCost() {
		double totalCost = 0; 
		
		for(Item item: cart.keySet()) {
			totalCost += getItemPrice(item);
		}
		return totalCost; 
	}
	
	public String toString() {
		String s = "Handlevogn med følgende varer: \n";
		for(Item item: cart.keySet()) {
			s += cart.get(item) + " av " + item.getName() + " koster kr " + getItemPrice(item) + "\n" ;
		}
		 s += "\n Totalsum blir: " + getCartCost();
		 return s; 
	}
	
	public static void main(String[] args) {
		ShoppingCart cart1 = new ShoppingCart(); 
		ShoppingCart cart2 = new ShoppingCart(); 
		System.out.println(cart1);
		Item jakke = new Item("Allværsjakke", 899, 5); 
		Item sko = new Item("Nike Free", 499, 8);
		Item kalkulator = new Item("Casio FX9860G2", 199, 200); 
		Item ruteskjorte = new Item("Rutete skjorte", 299, 9); 
		Item medlemskap = new Item("Medlemskap på samfundet", 900, 9999);
		
		cart1.addItem(sko, 3);
		cart1.addItem(jakke, 4);
		
		cart2.addItem(ruteskjorte, 1);
		cart2.addItem(medlemskap, 1);
		//cart2.addItem(jakke, 2);
		System.out.println(cart1);
		System.out.println(cart2);
	}
	
	
	
}
