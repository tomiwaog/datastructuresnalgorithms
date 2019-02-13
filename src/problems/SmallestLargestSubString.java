package problems;

public class SmallestLargestSubString {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s.substring(0,k);
        largest = s.substring(0, k);
        for (int i=0; i<= s.length()-k;i++){
            String cand= s.substring(i,i+k);
            if (cand.compareTo(largest)>=0) largest = cand;
            if(cand.compareTo(smallest)<=0) smallest = cand;
                    }
        System.out.println(smallest + "\n" + largest);
        return smallest + "\n" + largest;
    }
    
    public static void main(String[] args) {
    	System.out.println("ogu".compareTo("amo"));
		getSmallestAndLargest("welcometojava", 3);
	}
}
