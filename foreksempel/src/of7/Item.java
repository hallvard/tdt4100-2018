package of7;

import java.util.ArrayList;
import java.util.Collection;

public class Item {
	
	/*
	 @startuml
	 Class Item {
	 	String name
	 	double price
	 	int quantity
	 	Collection<ShoppingCarts> shoppingCarts
	 	+String getname()
	 }
	 Item "1:n" <-- "0:n" ShoppingCart : contains
	 Class ShoppingCart {
	 	Map<Item, Integer> cart 
	 	+ void addItem(Item item, int amount)
	 	+ double getCartCost()
	 }
	  
	  @enduml
	 */
	
	private String name; 
	private double price; 
	private Collection<ShoppingCart> shoppingCarts; 
	private int quantity ; 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void addShoppingCart(ShoppingCart sh) {
		if(!shoppingCarts.contains(sh)) {
			if(sh.getAmountItem(this)+this.getAmountOfItemsInCarts() <= quantity) {
				shoppingCarts.add(sh);
				}
			else {
				throw new IllegalArgumentException("Har ikke flere");
			}
		}

	}
	
	public int getAmountOfItemsInCarts() {
		int i =0; 
		
		for(ShoppingCart cart: shoppingCarts) {
			i+=cart.getAmountItem(this);
		}
		return i ; 
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return name + " selges til den nette sum av " + price +" kr" ; 
	}

	public Item(String name, double price, int quantity) {
		this.name=name; 
		this.price=price; 
		this.quantity = quantity; 
		shoppingCarts = new ArrayList<>(); 
	}
	
	
	
}
