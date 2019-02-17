package problems.discounts;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class HolidayDiscountsTest {
	Clock fakeClock;
	HolidayDiscounts discount;
	@Before
	public void setUp(){
		fakeClock = Mockito.mock(Clock.class);
	}
	
	@Test
	public void testChristmasDiscount(){
		Basket basket = new BasketBuilder().w("PC", 2000).build();
		 
		Calendar christmas = new GregorianCalendar(2017,Calendar.DECEMBER,25);
		Mockito.when(fakeClock.now()).thenReturn(christmas);
		
		HolidayDiscounts discount = new HolidayDiscounts(fakeClock);
		double actual = discount.calculateDiscount(basket);
		
		Assert.assertEquals(2000*0.05, actual, 0.0001);
	}
	
	@Test
	public void testJanuaryDiscount(){
		Basket basket = new BasketBuilder().w("PC", 2000).build();
		 
		Calendar jan = new GregorianCalendar(2018,Calendar.JANUARY,25);
		Mockito.when(fakeClock.now()).thenReturn(jan);
		
		HolidayDiscounts discount = new HolidayDiscounts(fakeClock);
		double actual = discount.calculateDiscount(basket);
		
		Assert.assertEquals(2000*0.15, actual, 0.0001);
	}
}
