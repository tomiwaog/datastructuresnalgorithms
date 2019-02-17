package problems.discounts;

import java.util.Calendar;

public class HolidayDiscounts {
	private Clock clock;

	public HolidayDiscounts(Clock clock) {
		this.clock = clock;
	}

	public double calculateDiscount(Basket shoppingBasket) {
		double discount = 0;
		if (isChristmas())
			discount = shoppingBasket.getAmount() * 0.05;
		if (isJanuary())
			discount = shoppingBasket.getAmount() * 0.15;

		return discount;
	}

	private boolean isChristmas() {
		Calendar today = clock.now();
		return today.get(Calendar.MONTH) == Calendar.DECEMBER
				&& today.get(Calendar.DAY_OF_MONTH) == 25;
	}

	private boolean isJanuary() {
		Calendar today = clock.now();
		return today.get(Calendar.MONTH) == Calendar.JANUARY;
	}
}
