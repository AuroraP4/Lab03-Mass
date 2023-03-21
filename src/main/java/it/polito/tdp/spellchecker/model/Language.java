package it.polito.tdp.spellchecker.model;

public enum Language {

		ITALIAN("Italian", "src/main/resources/Italian.txt"),
		ENGLISH("English", "src/main/resources/English.txt");
		
		private String name;
		private String filename;
		
		private Language(String name, String filename) {
			this.filename = name;
			this.filename = filename;
		}
		
		public String getFileName() {
			return filename;
		}
		
		public String getName() {
			return name;
		}
		
}
