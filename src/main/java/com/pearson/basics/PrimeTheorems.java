package com.pearson.basics;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class PrimeTheorems {
	
	int eulerTotient(int i) {
		List<Integer> totient = new ArrayList<Integer>();
		GCD gcd = new GCD();
		for(int temp = 1; temp < i; temp++) {
			int result = gcd.euclideanRevisitedGCD(i, temp);
			if (result == 1) {
				totient.add(temp);
			}
		}	
		return totient.size();
		
	}
	
	public boolean isPrime(long n, int iteration)
    {
        /** base case **/
        if (n == 0 || n == 1)
            return false;
        /** base case - 2 is prime **/
        if (n == 2)
            return true;
        /** an even number other than 2 is composite **/
        if (n % 2 == 0)
            return false;
 
        long s = n - 1;
        while (s % 2 == 0)
            s /= 2;
 
        Random rand = new Random();
        for (int i = 0; i < iteration; i++)
        {
            long r = Math.abs(rand.nextLong());            
            long a = r % (n - 1) + 1, temp = s;
            long mod = modPow(a, temp, n);
            while (temp != n - 1 && mod != 1 && mod != n - 1)
            {
                mod = mulMod(mod, mod, n);
                temp *= 2;
            }
            if (mod != n - 1 && temp % 2 == 0)
                return false;
        }
        return true;        
    }
	
	/** Function to calculate (a ^ b) % c **/
    public long modPow(long a, long b, long c)
    {
        long res = 1;
        for (int i = 0; i < b; i++)
        {
            res *= a;
            res %= c; 
        }
        return res % c;
    }
    
    /** Function to calculate (a * b) % c **/
    public long mulMod(long a, long b, long mod) 
    {
        return BigInteger.valueOf(a).multiply(BigInteger.valueOf(b)).mod(BigInteger.valueOf(mod)).longValue();
    }

	String TestPrime(int number){
		//miller Robin Primality
		
		
		List<Integer> factors = findFactor(number - 1);
		int q = factors.get(factors.size() - 1 );
		int k = 1;
		for(int count = 0 ; count < factors.size() - 1; count++) {
			k*= factors.get(count);
		}
		
		k = k/2;
		
		int randomNumber = randomWithRange(0, number - 1);
		int r = (int) Math.pow(randomNumber,q) % number;
		if ( r == 1 ) {
			return "inconclusive";
		}
		
		for( int j = 0; j < k; j++) {
			 int calculatedNumber = (int) Math.pow(randomNumber, Math.pow(2,j));
			 int reminder = (calculatedNumber) % number;
			 if ( reminder == (number - 1)) {
				 return "inconclusive";
			 }
		}
		
		return "composite";
	}
	
	int randomWithRange(int min, int max){
		   int range = (max - min) + 1;     
		   return (int)(Math.random() * range) + min;
		}
	
	List<Integer> findFactor(int number){
		List<Integer> result = new ArrayList<>();
		int quotient = number/2;
		result.add(2);
		while(quotient % 2 == 0) {
			quotient = quotient / 2;
			result.add(2);
		}
		result.add(quotient);
		
		
		return result;
	}
	
}
