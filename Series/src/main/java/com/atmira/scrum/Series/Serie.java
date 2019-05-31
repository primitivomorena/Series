package com.atmira.scrum.Series;

import java.util.List;

public class Serie {
	private enum idiomaOriginal{Castellano, Ingles, Latino, Italiano};
	private enum genero{Terror, Comedia, Drama};

	private String titulo;
	private int any;
	private String sinopsis;
	private genero generoSerie;
	private List<Personaje> listaPersonaje;
	private List<Temporada> listaTemporada;
	private idiomaOriginal idioma;
	private Double punt_media;
//	private List<Critica> listaCritica;
	
	public Serie(String titulo, int any, String sinopsis, genero generoSerie, List<Personaje> listaPersonaje,
			List<Temporada> listaTemporada, idiomaOriginal idioma, Double punt_media/*, List<Critica> listaCritica*/) {
		super();
		this.titulo = titulo;
		this.any = any;
		this.sinopsis = sinopsis;
		this.generoSerie = generoSerie;
		this.listaPersonaje = listaPersonaje;
		this.listaTemporada = listaTemporada;
		this.idioma = idioma;
		this.punt_media = punt_media;
		//this.listaCritica = listaCritica;
	}
	
	public Serie() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAny() {
		return any;
	}

	public void setAny(int any) {
		this.any = any;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public genero getGeneroSerie() {
		return generoSerie;
	}

	public void setGeneroSerie(genero generoSerie) {
		this.generoSerie = generoSerie;
	}

	public List<Personaje> getListaPersonaje() {
		return listaPersonaje;
	}

	public void setListaPersonaje(List<Personaje> listaPersonaje) {
		this.listaPersonaje = listaPersonaje;
	}

	public List<Temporada> getListaTemporada() {
		return listaTemporada;
	}

	public void setListaTemporada(List<Temporada> listaTemporada) {
		this.listaTemporada = listaTemporada;
	}

	public idiomaOriginal getIdioma() {
		return idioma;
	}

	public void setIdioma(idiomaOriginal idioma) {
		this.idioma = idioma;
	}

	public Double getPunt_media() {
		return punt_media;
	}

	public void setPunt_media(Double punt_media) {
		this.punt_media = punt_media;
	}

	/*public List<Critica> getListaCritica() {
		return listaCritica;
	}

	public void setListaCritica(List<Critica> listaCritica) {
		this.listaCritica = listaCritica;
	}*/	
}
