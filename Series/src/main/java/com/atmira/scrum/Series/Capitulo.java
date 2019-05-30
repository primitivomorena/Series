package com.atmira.scrum.Series;

import java.util.ArrayList;
import java.util.List;

public class Capitulo {

	private String tituloCapitulo;
	private int duracion;
	private int numeroCapitulo;
	List<Subtitulo> listaSubstitulos = new ArrayList<Subtitulo>();

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

	public List<Subtitulo> getListaSubstitulos() {
		return listaSubstitulos;
	}

	public void setListaSubstitulos(List<Subtitulo> listaSubstitulos) {
		this.listaSubstitulos = listaSubstitulos;
	}

}
