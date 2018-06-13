package dev.utils.tests;

import dev.utils.StringUtils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert.*;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance () {

		int res = StringUtils.levenshteinDistance("avion", "aviron");
		assertTrue("Le test numéro 1 a échoué", 1 == res);

		// Test avec -1 car le calcul est impossible avec null
		res = StringUtils.levenshteinDistance(null, "lourd");
		assertTrue("Le test numéro 1 a échoué", -1 == res);

		res = StringUtils.levenshteinDistance("avion", null);
		assertTrue("Le test numéro 1 a échoué", -1 == res);

		res = StringUtils.levenshteinDistance(null, null);
		assertTrue("Le test numéro 1 a échoué", -1 == res);

		res = StringUtils.levenshteinDistance("","");
		assertTrue("Le test numéro 1 a échoué", 0 == res);

		res = StringUtils.levenshteinDistance("","aviron");
		assertTrue("Le test numéro 1 a échoué", 6 == res);
	}
}
