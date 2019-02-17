package problems.discounts;

public class BasketBuilder {
	String name; double amount;
	
	BasketBuilder w(String name, double amount){
		this.name = name;
		this.amount+= amount;
		return this;
	}
	
	Basket build(){
		return new Basket(amount);
	}
}
