package others.testfactorybuilder;

import java.util.ArrayList;
import java.util.List;

public class BasketBuilder {
	List<Item>items;
	
	public BasketBuilder() {
		items = new ArrayList<Item>();
	}
	public BasketBuilder w(String name, double price){
		return w(name, 1,price);
	}
	
	public BasketBuilder w(String name, int quantity, double price){
		items.add(new Item(name,quantity,price));
		return this;
	}
	
	public Basket build(){
		return new Basket(items);
	}
}
