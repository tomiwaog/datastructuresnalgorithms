package problems;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;


public class ValidIPAddress {
	    
	    static String eachBlock = "([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[2]([0-4][0-9]|[25][0-5])).";
	    public static String lol = eachBlock + eachBlock + eachBlock + eachBlock;
	    public static String pattern = "^"+lol.substring(0,lol.length()-1)+"$";
	    
	    
	    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(pattern));
	        }

	    }
	    
	    @Test 
	    public void TestGoodIP(){
	    	String ip = "120.0.0.1";
	    	Assert.assertEquals(true, ip.matches(pattern));
	    }
	    
	    @Test 
	    public void TestBadIPWithLength(){
	    	String ip = "120.3330.0.";
	    	Assert.assertEquals(false, ip.matches(pattern));
	    }
	}
