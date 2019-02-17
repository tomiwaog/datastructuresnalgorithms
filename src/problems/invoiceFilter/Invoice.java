package problems.invoiceFilter;

import java.util.Calendar;

public class Invoice {

	private int amount;
	private String name;
	private Calendar instance;

	public Invoice(Calendar instance, String string, int amount) {
		this.amount=amount;
		name = string;
		this.instance=instance;
	}

	public int getAmount() {
		return amount;
	}

	public String getCustomer() {
		return name;
	}

	public Calendar getDate() {
		return null;
	}

	public Calendar getInstance() {
		return instance;
	}

}
