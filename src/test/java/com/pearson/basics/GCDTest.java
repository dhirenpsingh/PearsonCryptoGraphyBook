package com.pearson.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class GCDTest {
	
	@Test
	void euclideanGCDTest() {
		int b = 1160718174;
		int a = 316258250;
		
		GCD uc = new GCD();
		int gcd = uc.euclideanGCD(a, b);
		
		assertEquals(gcd, 1078);
	}
	
	@Test
	void euclideanRevisitedGCDTest() {
		int b = 1160718174;
		int a = 316258250;
		
		GCD uc = new GCD();
		int gcd = uc.euclideanRevisitedGCD(a, b);
		
		assertEquals(gcd, 1078);
	}
	
	@Test
	void euclideanExtendedGCDTest() {
		int b = 550;
		int a = 1759;
		
		GCD uc = new GCD();
		ArrayList<Integer> actualResult = uc.EuclideanExtended(a, b);
		ArrayList<Integer> expectedResult = new ArrayList<>();
		expectedResult.add(-111);
		expectedResult.add(355);
		assertEquals(expectedResult, actualResult);
		
		
	}
	
}
