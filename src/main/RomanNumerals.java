package main;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {
	
	private static Map<Integer, String> values = new LinkedHashMap<Integer, String>();
	static {
		values.put(1000,"M");
		values.put(500, "D");
		values.put(100, "C");
		values.put(50,  "L");
		values.put(10,  "X");
		values.put(5,   "V");
		values.put(1,   "I");
	}
 	
	public static String fromDecimal(Integer decimal) {	
		if(decimal == 0)
			return "";
		int step = smallestPossibleDecimal(decimal);
		return values.get(step) + fromDecimal(decimal - step);
	}
	
	public static int smallestPossibleDecimal(Integer decimal){
		for (Map.Entry<Integer, String> item: values.entrySet()) {
			if (decimal >= item.getKey())
				return item.getKey();
		}
		return 1;
	}
}
