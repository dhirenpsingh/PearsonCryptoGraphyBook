package com.pearson.cipher.symmetric;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CeaserCipherTest {
	
	@Test
	void encryptTest() {
		String input = "dhiren singh";
		int shift = 4;
		CeaserCipher cc = new CeaserCipher();
		StringBuffer result = cc.encrypt(input, shift);
		//System.out.println("encryptTest: " +result.toString());
		
		assertEquals(result.toString(), "HLMVIR WMRKL");
	}
	
	@Test
	void decryptTest() {
		String input = "HLMVIR WMRKL";
		int shift = 4;
		CeaserCipher cc = new CeaserCipher();
		StringBuffer result = cc.decrypt(input, shift);
		//System.out.println("encryptTest: " +result.toString());
		
		assertEquals(result.toString(), "dhiren singh");
	}

}
