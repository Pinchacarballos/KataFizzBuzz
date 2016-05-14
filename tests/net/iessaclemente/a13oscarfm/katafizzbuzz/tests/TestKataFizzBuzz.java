package net.iessaclemente.a13oscarfm.katafizzbuzz.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import net.iessanclemente.a13oscarfm.katafizzbuzz.KataFizzBuzz;

public class TestKataFizzBuzz {

	/**
	 * A global variable for all tests
	 */
	private KataFizzBuzz kfb;

	/**
	 * Initialise kfb before starts tests
	 */
	@Before
	public void setUp(){
		kfb = new KataFizzBuzz();
	}

	/**
	 * This test checks if given number is multiple of 3
	 */
	@Test
	public void testMultiplposTres() {
		String result = kfb.multiplos(9);
		assertEquals("Fizz", result);
	}
	/**
	 * This test checks if given number is multiple of 5
	 */
	@Test
	public void testMultiplposCinco() {
		String result = kfb.multiplos(25);
		assertEquals("Buzz", result);
	}
	/**
	 * This test checks if given number is multiple of 3 and 5
	 */
	@Test
	public void testMultiplosAmbos(){
		String result = kfb.multiplos(15);
		assertEquals("FizzBuzz", result);
	}

	/**
	 * This test checks if given number contains 5
	 */
	public void testContieneCinco(){
		String result = kfb.multiplos(52);
		assertEquals("Buzz", result);
	}

}
