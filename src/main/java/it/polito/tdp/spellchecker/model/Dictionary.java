package it.polito.tdp.spellchecker.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dictionary {
	
	private Set<String> words;
	
	public Dictionary loadDictionary(Language lang) {
		try {
			words = loadFile(lang.getFileName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return this;
	}
	
	private Set<String> loadFile(String filename) throws IOException {
		
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		
		Set<String> wordsLoader = new HashSet<String>();
		
		String line;
		while ((line = br.readLine()) != null) {
			wordsLoader.add(line);
		}
		
		br.close();
		fr.close();
		
		return wordsLoader;
	}
	
	public boolean contains(String word) {
		return words.contains(word);
	}
	
	public List<String> typoos(String userInput) {
		
		userInput = userInput.trim();
		userInput.replaceAll("[.,\\/#!$%\\^&\\*;:{}=\\-_`~()\\[\\]\"]", "");
		userInput.replaceAll("\\n", " ");
		
		String[] words = userInput.split(" ");
		
		List<String> wordsWithTypoos = new ArrayList<String>();
		for (String word : words) {
			word = word.toLowerCase();
			if (!this.contains(word)) {
				wordsWithTypoos.add(word);
			}
		}
		
		return wordsWithTypoos;
	}
	
}
