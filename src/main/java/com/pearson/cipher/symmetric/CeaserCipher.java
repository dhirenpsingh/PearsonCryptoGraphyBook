package com.pearson.cipher.symmetric;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CeaserCipher {

	private static final Logger logger = LogManager.getLogger(CeaserCipher.class);

	StringBuffer encrypt(String input, int shift) {
		logger.info("input: " + input.toString());
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < input.length(); i++) {
			if (Character.isAlphabetic(input.charAt(i))) {
				char c = (char) ((int) (Character.toUpperCase(input.charAt(i)) + shift - 65) % 26 + 65);
				result.append(Character.toUpperCase(c));
			} else
				result.append(input.charAt(i));
		}
		logger.info("Result: " + result.toString());
		return result;

	}

	StringBuffer decrypt(String input, int shift) {
		logger.info("input: " + input.toString());
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < input.length(); i++) {

			if (Character.isAlphabetic(input.charAt(i))) {
				char c = (char) ((int) (input.charAt(i) - shift - 65) % 26 + 65);
				result.append(Character.toLowerCase(c));
			} else
				result.append(input.charAt(i));
		}

		logger.info("Result: " + result.toString());

		return result;

	}

}
