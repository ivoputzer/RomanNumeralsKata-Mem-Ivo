package test;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import main.RomanNumerals;

public class RomanNumeralsTest {

	@Test
	public void testSimpleRomanNumerals () {
		assertEquals("I", RomanNumerals.fromDecimal(1));
		assertEquals("II", RomanNumerals.fromDecimal(2));
		assertEquals("III", RomanNumerals.fromDecimal(3));
		assertEquals("V", RomanNumerals.fromDecimal(5));
		assertEquals("X", RomanNumerals.fromDecimal(10));
		assertEquals("L", RomanNumerals.fromDecimal(50));
		assertEquals("C", RomanNumerals.fromDecimal(100));
		assertEquals("D", RomanNumerals.fromDecimal(500));
		assertEquals("M", RomanNumerals.fromDecimal(1000));
	}
		
	@Test
	public void testSmallestPossibileDecimalStep() throws Exception {
		assertEquals(1, RomanNumerals.smallestPossibleDecimal(1));
		assertEquals(1, RomanNumerals.smallestPossibleDecimal(3));
		assertEquals(5, RomanNumerals.smallestPossibleDecimal(7));
		
	}
}