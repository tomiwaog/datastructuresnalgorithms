package problems.invoiceFilter;

import java.util.Arrays;
import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class InvoiceFilterTest {
	private InvoiceFilter invFilter;
	private InvoiceRepoDB repo;
	
	@Before
	public void setUp(){
		repo = Mockito.mock(InvoiceRepoDB.class);
		invFilter = new InvoiceFilter(repo);
	}

	
	@Test
	public void filterInvoiceGreaterThan2000(){
		Invoice invoice1 = new Invoice(Calendar.getInstance(), "GSK", 5000);
		Invoice invoice2 = new Invoice(Calendar.getInstance(), "Tomiwa", 3000);
		
		Mockito.when(repo.getAllDataFromDB()).thenReturn(Arrays.asList(invoice1,invoice2)); //Returns this instead of Coded-DB
		
		Assert.assertEquals(5000, invFilter.filter().get(0).getAmount());
		Assert.assertEquals(2, invFilter.filter().size());
		Assert.assertEquals("Tomiwa", invFilter.filter().get(1).getCustomer());
		
	}
	
	@Test
	public void testMicrosoftFilter(){
		Invoice invoice1 = new Invoice(Calendar.getInstance(), "Microsoft", 1000);
		Mockito.when(repo.getAllDataFromDB()).thenReturn(Arrays.asList(invoice1)); //Returns this instead of Coded-DB
		
		Assert.assertEquals(1000, invFilter.filter().get(0).getAmount());
		Assert.assertEquals(1, invFilter.filter().size());
		
	}
}
