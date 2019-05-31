package com.atmira.scrum.Series;

import java.util.ArrayList;
import java.util.List;

public class Capitulo {

	private String tituloCapitulo;
	private int duracion;
	private int numeroCapitulo;
	List<Subtitulo> listaSubtitulos = new ArrayList<Subtitulo>();
	// List<Personaje> listaPersonajes = new ArrayList<Personaje>();
	// List<Critica> listaCriticas = new ArrayList<Critica>();

	public String getTituloCapitulo() {
		return tituloCapitulo;
	}

	public void setTituloCapitulo(String tituloCapitulo) {
		this.tituloCapitulo = tituloCapitulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getNumeroCapitulo() {
		return numeroCapitulo;
	}

	public void setNumeroCapitulo(int numeroCapitulo) {
		this.numeroCapitulo = numeroCapitulo;
	}

	public List<Subtitulo> getListaSubtitulos() {
		return listaSubtitulos;
	}

	public void setListaSubtitulos(List<Subtitulo> listaSubtitulos) {
		this.listaSubtitulos = listaSubtitulos;
	}

	// public List<Personaje> getListaPersonajes() {
	// return listaPersonajes;
	// }

	// public void setListaPersonajes(List<Personaje> listaPersonajes) {
	// this.listaPersonajes = listaPersonajes;
	// }

	// public List<Critica> getListaCriticas() {
	// return listaCriticas;
	// }

	// public void setListaCriticas(List<Critica> listaCriticas) {
	// this.listaCriticas = listaCriticas;
	// }

}
