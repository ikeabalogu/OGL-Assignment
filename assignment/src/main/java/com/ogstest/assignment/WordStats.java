package com.ogstest.assignment;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class WordStats {

	private int longestWord;
	private double averageWordLength;
	private int shortestWord;
	private int wordCount;

	public WordStats(String str) {
		List<String> array = Arrays.asList(str.split(" "));
		IntSummaryStatistics arrayStats = 
				array.stream().mapToInt(String::length).summaryStatistics();

		setLongestWord(arrayStats.getMax());
		setAverageWordLength(arrayStats.getAverage());
		setShortestWord(arrayStats.getMin());
		setWordCount(array.size());
		
	}
	
	public int getLongestWord() {
		return longestWord;
	}

	public void setLongestWord(int longestWord) {
		this.longestWord = longestWord;
	}

	public double getAverageWordLength() {
		return averageWordLength;
	}

	public void setAverageWordLength(double d) {
		this.averageWordLength = d;
	}

	public int getShortestWord() {
		return shortestWord;
	}

	public void setShortestWord(int shortestWord) {
		this.shortestWord = shortestWord;
	}

	public int getWordCount() {
		return wordCount;
	}

	public void setWordCount(int wordCount) {
		this.wordCount = wordCount;
	}

}
