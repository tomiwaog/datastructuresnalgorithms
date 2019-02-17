package problems.invoiceFilter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class InvoiceFilter {
	
	private InvoiceRepoDB invoices;
	
	public InvoiceFilter(InvoiceRepoDB invoices){
		this.invoices = invoices;
	}
	
	public List<Invoice> filter(){
		List<Invoice> filteredInvoices = new ArrayList<Invoice>();

		for(Invoice invoice : invoices.getAllDataFromDB()){
			
			if (invoice.getAmount() > 2000) filteredInvoices.add(invoice);
			else if (invoice.getAmount()<2000 && invoice.getCustomer().equals("Microsoft")) filteredInvoices.add(invoice);
			else if (invoice.getDate().get(Calendar.YEAR)<1999) filteredInvoices.add(invoice);
		}
		return filteredInvoices;
	}
}
