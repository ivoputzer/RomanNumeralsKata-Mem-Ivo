package test;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import main.RomanNumerals;

public class RomanNumeralsTest {

	@Test
	public void testSimpleRomanNumerals() {
		assertEquals("", RomanNumerals.fromDecimal(0));
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
	public void testSmallestPossibileDecimalStep() {
		assertEquals(0, RomanNumerals.greatestRomanNumberEquivalentFor(0));
		assertEquals(1, RomanNumerals.greatestRomanNumberEquivalentFor(1));
		assertEquals(1, RomanNumerals.greatestRomanNumberEquivalentFor(3));
		assertEquals(5, RomanNumerals.greatestRomanNumberEquivalentFor(7));

	}

	@Test
	public void testSucceedingRomanNumerals() {
		assertEquals("VI", RomanNumerals.fromDecimal(6));
		assertEquals("VIII", RomanNumerals.fromDecimal(8));
	}

	@Test
	public void testPrecedingRomanNumerals() {
		assertEquals("IV", RomanNumerals.fromDecimal(4));
		assertEquals("IX", RomanNumerals.fromDecimal(9));
		assertEquals("XL", RomanNumerals.fromDecimal(40));
		assertEquals("XC", RomanNumerals.fromDecimal(90));
		assertEquals("CD", RomanNumerals.fromDecimal(400));
		assertEquals("CM", RomanNumerals.fromDecimal(900));
	}

	@Test
	public void testComplexNumbers() {
		assertEquals("MCMXCIX", RomanNumerals.fromDecimal(1999));
		assertEquals("DCXCI", RomanNumerals.fromDecimal(691));
		assertEquals("XXVII", RomanNumerals.fromDecimal(27));
		assertEquals("MMDCCXXXVII", RomanNumerals.fromDecimal(2737));

	}

}
