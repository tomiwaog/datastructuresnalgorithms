package algorithms;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
	private BinarySearch myBSearch;
	
	@Before
	public void setUp(){
		//Required for instance methods, null assigned vars can still call static methods
		myBSearch = new BinarySearch(); //Initializer
		System.out.println("Set up ini");
	}
	
	//Helper methods
	private int[] arr(int... arr){
		return arr;
	}
	
	@Test
	public void TestListOfNums() {
		Assert.assertEquals(1, myBSearch.indexOf(arr( 4, 5, 2, 1, 19, 20, 7, 23 ), 2));
	}
	
	@Test
	public void TestInvalidkey(){
		int[] myarr= new int[] { 4, 5, 2, 1, 19, 20, 7, 23 };
		Assert.assertEquals(-1, myBSearch.indexOf(myarr, 5003));
	}
	
	@Test
	public void TestDecreasingNum(){
		int[] myarr= arr(20,19,18,17,16);
		Assert.assertEquals(myarr.length-1, myBSearch.indexOf(myarr, 20));
	}
}