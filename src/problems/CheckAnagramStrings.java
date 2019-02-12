package problems;

public class CheckAnagramStrings {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    	/*
    	 * Compares count of each character in a string with that of another
    	 * If both Strings have same amount of each character i.e.{a | a E (Aa-Zz 0-9) where a = b}. |a|=|b| 
    	 */
        if(a.length()==b.length()){
            char[]aa = a.toUpperCase().toCharArray();
            char[]bb = b.toUpperCase().toCharArray();
            for(int i=0; i<aa.length;i++){
                int countj=0,countk=0;
                for(int j=0;j<aa.length;j++)
                    if(aa[j]==aa[i])
                        countj++;
                
                for(int k=0;k<bb.length;k++){
                    if(bb[k]==aa[i])
                    countk++;
                }
                if(countj!=countk)
                    return false;
            }
            return true;
        }
        return false;
    }

}


