package com.atmira.scrum.Series;

import java.util.Date;
import java.util.List;

public class Temporada {
	private int num_temp;
	private Serie serie;
	private List<Capitulo> ListaCapitulos;
	private Date fecha_produccion;
	private Date fecha_salida;
	
	public Temporada(int num_temp, Serie serie, List<Capitulo> listaCapitulos, Date fecha_produccion,
			Date fecha_salida) {
		super();
		this.num_temp = num_temp;
		this.serie = serie;
		ListaCapitulos = listaCapitulos;
		this.fecha_produccion = fecha_produccion;
		this.fecha_salida = fecha_salida;
	}

	public Temporada() {
		super();
	}

	public int getNum_temp() {
		return num_temp;
	}

	public void setNum_temp(int num_temp) {
		this.num_temp = num_temp;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	public List<Capitulo> getListaCapitulos() {
		return ListaCapitulos;
	}

	public void setListaCapitulos(List<Capitulo> listaCapitulos) {
		ListaCapitulos = listaCapitulos;
	}

	public Date getFecha_produccion() {
		return fecha_produccion;
	}

	public void setFecha_produccion(Date fecha_produccion) {
		this.fecha_produccion = fecha_produccion;
	}

	public Date getFecha_salida() {
		return fecha_salida;
	}

	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}
	
	
	
	
}
