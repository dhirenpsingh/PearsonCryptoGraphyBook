package com.pearson.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PrimeTheoremsTest {
	
	@Test
	void eulerTotientTest() {
		int a = 37;
		
		PrimeTheorems pt = new PrimeTheorems();
		int result = pt.eulerTotient(a);		
		
		assertEquals(result, 36);
	}
	
	@Test
	void findFactorTest() {
		int a = 100;
		PrimeTheorems pt = new PrimeTheorems();
		List<Integer> result = pt.findFactor(a);
	}
	
	
	@Test
	void isPrimeTest(){
		int a = 29;
		int iteration = 2;
		PrimeTheorems pt = new PrimeTheorems();
		boolean result = pt.isPrime(a, iteration);
		System.out.println("isPrimeTest - Result: " +result);
		assertEquals(result, true);
		
	}
	
	
}
