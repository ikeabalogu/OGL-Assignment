package com.ogstest.assignment;

import static org.junit.Assert.*;
import org.junit.Test;


public class WordStatsTest {
	String str = "this a test string for the ogs task";
	WordStats word = new WordStats(str);

	@Test
	public void testGetLongestWord() {
		assertEquals(6, word.getLongestWord());
	}

	@Test
	public void testGetAverageWordLength() {
		assertEquals(3.5, word.getAverageWordLength(),0.0);
	}

	@Test
	public void testGetShortestWord() {
		assertEquals(1, word.getShortestWord());
	}

	@Test
	public void testGetWordCount() {
		assertEquals(8, word.getWordCount());
	}

}
