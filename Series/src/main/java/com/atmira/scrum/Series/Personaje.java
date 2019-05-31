package com.atmira.scrum.Series;

import java.util.ArrayList;

public class Personaje {

	private String nombre_personaje;
	private int edad;
	private Actor actor;

	ArrayList<Capitulo> lista_capitulos = new ArrayList<Capitulo>();

	ArrayList<Serie> lista_serie = new ArrayList<Serie>();

	private void afegir_actor(String nombre_actor, String nacionalidad_actor, int edad_actor) {
		this.actor = new Actor(nombre_actor, nacionalidad_actor, edad_actor);
	}

	public Personaje(String nombre_personaje, int edad, String actor, String nombre_actor, String nacionalidad_actor,
			int edad_actor) {
		this.nombre_personaje = nombre_personaje;
		this.edad = edad;
		afegir_actor(nombre_actor, nacionalidad_actor, edad_actor);
	}

	public String getNombre_personaje() {
		return nombre_personaje;
	}

	public void setNombre_personaje(String nombre_personaje) {
		this.nombre_personaje = nombre_personaje;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	/*
	 * public String getNombre_actor() { return nombre_actor; }
	 * 
	 * public void setNombre_actor(String nombre_actor) { this.nombre_actor =
	 * nombre_actor; }
	 */

}
