package main;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

	private static final Map<Integer, String> ROMAN_NUMBERS = new LinkedHashMap<Integer, String>();
	
	static {
		ROMAN_NUMBERS.put(1000, "M");
		ROMAN_NUMBERS.put(900, "CM");
		ROMAN_NUMBERS.put(500, "D");
		ROMAN_NUMBERS.put(400, "CD");
		ROMAN_NUMBERS.put(100, "C");
		ROMAN_NUMBERS.put(90, "XC");
		ROMAN_NUMBERS.put(50, "L");
		ROMAN_NUMBERS.put(40, "XL");
		ROMAN_NUMBERS.put(10, "X");
		ROMAN_NUMBERS.put(9, "IX");
		ROMAN_NUMBERS.put(5, "V");
		ROMAN_NUMBERS.put(4, "IV");
		ROMAN_NUMBERS.put(1, "I");
	}

	public static String fromDecimal(Integer decimal) {
		if (decimal == 0)
			return "";
		int greatestRomanNumberEquivalent = greatestRomanNumberEquivalentFor(decimal);
		return ROMAN_NUMBERS.get(greatestRomanNumberEquivalent) + fromDecimal(decimal - greatestRomanNumberEquivalent);
	}

	public static int greatestRomanNumberEquivalentFor(Integer decimal) {
		for (Map.Entry<Integer, String> item : ROMAN_NUMBERS.entrySet()) {
			if (decimal >= item.getKey())
				return item.getKey();
		}
		return 0;
	}
	
}
