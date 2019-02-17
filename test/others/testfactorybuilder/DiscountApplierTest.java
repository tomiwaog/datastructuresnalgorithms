package others.testfactorybuilder;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DiscountApplierTest {

	@Test
	public void testDiscount() {
		//Not utilising Builder Pattern 
		DiscountApplier applier = new DiscountApplier();
		List<Item> list = new ArrayList<Item>();
		list.add(new Item("XBOX", 1, 500));
		Basket basket = new Basket(list);
		applier.apply(basket);
		double expected = (500 * 0.3);
		Assert.assertEquals(expected, basket.getAmount(), 000.01);
	}

	@Test
	public void testDiscountUsingBuilderDP() {
		Basket basket = new BasketBuilder().w("MACBOOK", 1000).w("IPHONE", 700).build();		
		DiscountApplier applier = new DiscountApplier();
		applier.apply(basket);
		double expected = (1700 * 0.85);
		Assert.assertEquals(expected, basket.getAmount(), 000.01);

	}
}
