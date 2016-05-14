package net.iessaclemente.a13oscarfm.katafizzbuzz.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import net.iessanclemente.a13oscarfm.katafizzbuzz.KataFizzBuzz;

public class TestKataFizzBuzz {

	private KataFizzBuzz kfb;
	
	@Before
	public void setUp(){
		kfb = new KataFizzBuzz();
	}
	
	@Test
	public void testMultiplposTres() {
		String result = kfb.multiplosTres(9);
		assertEquals("Fizz", result);
	}

}
