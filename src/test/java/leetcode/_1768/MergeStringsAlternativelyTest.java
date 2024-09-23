package leetcode._1768;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

class MergeStringsAlternativelyTest {

	@Test
	void testMerge1() {
		assertEquals(mergeAlternately("abc", "pqr"), "apbqcr");
	}

	@Test
	void testMerge2() {
		assertEquals(mergeAlternately("ab", "pqrs"), "apbqrs");
	}

	@Test
	void testMerge3() {
		assertEquals(mergeAlternately("abcd", "pq"), "apbqcd");
	}

	public String mergeAlternately(String word1, String word2) {
		StringBuilder result = new StringBuilder();
		int i = 0, j = 0;
		while (i < word1.length() || j < word2.length()) {
			if (i < word1.length()) {
				result.append(word1.charAt(i++));
			}
			if (j < word2.length()) {
				result.append(word2.charAt(j++));
			}
		}
		return result.toString();
	}

}
