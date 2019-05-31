package com.atmira.scrum.Series;

public class Subtitulo {

	public static enum Idioma {
		ESPANOL, LATINO, FRANCES, CATALAN, EUSKERA, INGLES, ALEMAN
	}

	private String autor;
	private Idioma idioma;

	public Subtitulo(String autor, Idioma idioma) {
		this.idioma = idioma;
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
