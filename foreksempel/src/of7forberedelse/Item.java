package of7forberedelse;

import java.util.ArrayList;
import java.util.Collection;

/*
 @startuml
 Class Item {
 	-String name
 	-double price
 	-Collection<ShoppingCarts> shoppingCarts
 	+String getName()
 }
 Item "1:n" <-- "0:n" ShoppingCart : contains
 Class ShoppingCart {
 	-Map<Item, Double> cart
 	+ void addItemAmount(Item item, double amount)
 	+ double getCartCost()
 }
 @enduml
 */

public class Item {

	private String name;
	private double price;
	private Collection<ShoppingCart> shoppingCarts;
	private int quantity ; 
	
	public Item(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.shoppingCarts = new ArrayList<>();
		this.quantity = quantity; 
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public void addShoppingCart(ShoppingCart sh, double amount) {
		if(getNumberOfItemInShoppingCarts()+amount>this.quantity) {
			throw new IllegalArgumentException("Not enough items left");
		}
		if (!shoppingCarts.contains(sh)) {
			shoppingCarts.add(sh);
		}
	}
	
	public Collection<ShoppingCart> getShoppingCarts() {
		return shoppingCarts;
	}
	private int getNumberOfItemInShoppingCarts() {
		int i = 0; 
		for(ShoppingCart cart: shoppingCarts) {
			i += cart.getAmount(this);
		}
		return i; 
	}

	@Override
	public String toString() {
		return name + ", til den nette sum av " + price + ".";
	}

}
