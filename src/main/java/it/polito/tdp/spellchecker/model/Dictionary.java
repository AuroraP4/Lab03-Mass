package it.polito.tdp.spellchecker.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dictionary {
	
	public enum Languages {
		ITALIAN("src/main/resources/Italian.txt"),
		ENGLISH("src/main/resources/English.txt");
		
		private String filename;
		
		private Languages(String filename) {
			this.filename = filename;
		}
	}
	
	private Set<String> words;
	
	public Dictionary(Languages lang) {
		this.loadDictionary(lang);
	}
	
	public Dictionary loadDictionary(Languages lang) {
		try {
			words = loadFile(lang.filename);
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
			if (!this.contains(word)) {
				wordsWithTypoos.add(word);
			}
		}
		
		return wordsWithTypoos;
	}
	
}
