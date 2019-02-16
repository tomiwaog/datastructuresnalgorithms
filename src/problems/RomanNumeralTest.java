package problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/*
 * I = 1
 * V = 5
 * X = 10
 * L = 50
 * C = 100
 * D = 500
 * M = 1000
 */

public class RomanNumeralTest {
	RomanNumeral roman;
	
	@Before
	public void setUp(){
		roman = new RomanNumeral();
	}
	
	@Test
	public void testSingleSymbol(){
		int actuals = roman.convert("I");
		Assert.assertEquals(1, actuals);
		Assert.assertEquals(5, roman.convert("V"));
		Assert.assertEquals(10, roman.convert("X"));
		Assert.assertEquals(500, roman.convert("D"));
	}
	
	@Test
	public void testDoubleSystem(){
		Assert.assertEquals(3, roman.convert("III"));
		Assert.assertEquals(6, roman.convert("VI"));
		Assert.assertEquals(16, roman.convert("XVI"));
	}
	
	@Test
	public void testSymbolOrder(){
		Assert.assertEquals(4, roman.convert("IV"));
		Assert.assertEquals(9, roman.convert("IX"));
	}
	
	@Test
	public void testSymbolOverload(){
		Assert.assertEquals(-1, roman.convert("VVV"));
		Assert.assertEquals(30, roman.convert("XXX"));
		Assert.assertEquals(40, roman.convert("XXXX"));
		Assert.assertEquals(4, roman.convert("IIII"));
		Assert.assertEquals(-1, roman.convert("XXXXX"));
		Assert.assertEquals(300, roman.convert("CCC"));
		Assert.assertEquals(-1, roman.convert("CCCCC"));
		Assert.assertEquals(500, roman.convert("D"));
		Assert.assertEquals(-1, roman.convert("DD"));
	}
}
