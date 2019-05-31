package com.atmira.scrum.Series;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Critica {
	private DateTimeAtCompleted fecha;
	private String comentario;
	private Serie serie;
	private Capitulo cap;
	private Usuario usuario;
	
	public Critica() {
		super();
	}
	
	public Critica(DateTimeAtCompleted fecha, String comentario, Serie serie, Capitulo cap, Usuario usuario) {
		super();
		this.fecha = fecha;
		this.comentario = comentario;
		this.serie = serie;
		this.cap = cap;
		this.usuario = usuario;
	}

	public DateTimeAtCompleted getFecha() {
		return fecha;
	}
	public void setFecha(DateTimeAtCompleted fecha) {
		this.fecha = fecha;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	public Capitulo getCap() {
		return cap;
	}
	public void setCap(Capitulo cap) {
		this.cap = cap;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
