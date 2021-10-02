package com.pearson.basics;

import java.util.ArrayList;


public class GCD {
	
	int euclideanGCD(int a, int b) {
		if(a < b) {
			int t = 0;
			t = a;
			a = b;
			b = t;
		}
		
		int r = a % b;
		if (r > 0) {
			return euclideanGCD(b,r);
		}
		else
			return b;
	}

	int euclideanRevisitedGCD(int a, int b) {		
		if(b == 0)
			return a;
		else
			return euclideanRevisitedGCD(b, a % b);
	}
	
	ArrayList<Integer> EuclideanExtended(int a, int b){
		int x0 = 1;
		int x1 = 0;
		int y0 = 0;
		int y1 = 1;
		
		ArrayList<Integer> result = CalculateEuclideanExtended(a,  b,  x0,  x1,  y0,  y1);
		return result;
		
	}
	
	ArrayList<Integer> CalculateEuclideanExtended(int a, int b, int x0, int x1, int y0, int y1){
		ArrayList<Integer> result = new ArrayList<>();
		int r = a % b;
		if (r == 0) {
			
			result.add(x1);
			result.add(y1);
			return result;
		}
		else {
			int q = a / b;
			int x = x0 - (q * x1);
			int y = y0 - (q * y1);
			System.out.println();
			return CalculateEuclideanExtended(b, r, x1, x, y1, y);
		}
		
		
	}
}
