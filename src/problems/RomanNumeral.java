package problems;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

	Map<String, Integer> romanMap;

	public RomanNumeral() {
		romanMap = new HashMap<String, Integer>();
		romanMap.put("I", 1);
		romanMap.put("V", 5);
		romanMap.put("X", 10);
		romanMap.put("L", 50);
		romanMap.put("C", 100);
		romanMap.put("D", 500);
		romanMap.put("M", 1000);
	}

	public int convert(String key) {
		int total = 0;
		for (int i = 0; i < key.length(); i++) {
			int nextGet = 0;
			if (i < key.length() - 1) {
				String nextSymbol = key.substring(i + 1, i + 2);
				nextGet = romanMap.get(nextSymbol);
			}

			int currentGet = romanMap.get(key.substring(i, i + 1));
			if (nextGet > currentGet)
				currentGet *= -1;

			total += currentGet;
			
			if (i>0 && romanMap.containsValue(total)){return -1;
			}
		}
		return total;

	}
}
