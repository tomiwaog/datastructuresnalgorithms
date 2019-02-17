package problems.discounts;

public class Basket {
	String name; double amount;
	public double getAmount() {
		return amount;
	}
	
	public Basket(double amount){
		this.amount+=amount;
	}
	
}
