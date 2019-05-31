package com.atmira.scrum.Series;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.atmira.scrum.Series.Subtitulo.Idioma;

public class Capitulo {

	private String tituloCapitulo;
	private int duracion;
	private int numeroCapitulo;
	private Temporada temporada;
	List<Subtitulo> listaSubtitulos = new ArrayList<Subtitulo>();
	List<Personaje> listaPersonajes = new ArrayList<Personaje>();
	// List<Critica> listaCriticas = new ArrayList<Critica>();

	public Capitulo(String tituloCapitulo, int duracion, int numeroCapitulo, Temporada temporada) {
		super();
		this.tituloCapitulo = tituloCapitulo;
		this.duracion = duracion;
		this.numeroCapitulo = numeroCapitulo;
		this.temporada = temporada;
	}

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

	/// METODOS ///

	private void AniadirSubtitulo() {
		String autor;
		int numIdioma;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce el autor de los subtitulos: ");
		autor = scan.nextLine();
		System.out.println("Selecciona el numero de un idioma: \n\t1 - Español \n\t2 - Latino "
				+ "\n\t3 - Frances \n\t4 - Catalan \n\t5 - EUSKERA \n\t6 - INGLES \n\t7 - ALEMAN");
		numIdioma = scan.nextInt();

		switch (numIdioma) {
		case 1:
			Subtitulo subEspanol = new Subtitulo(autor, Idioma.ESPANOL);
			this.listaSubtitulos.add(subEspanol);
			break;
		case 2:
			Subtitulo subLatino = new Subtitulo(autor, Idioma.LATINO);
			this.listaSubtitulos.add(subLatino);
			break;
		case 3:
			Subtitulo subFrances = new Subtitulo(autor, Idioma.FRANCES);
			this.listaSubtitulos.add(subFrances);
			break;
		case 4:
			Subtitulo subCatalan = new Subtitulo(autor, Idioma.CATALAN);
			this.listaSubtitulos.add(subCatalan);
			break;
		case 5:
			Subtitulo subEuskera = new Subtitulo(autor, Idioma.EUSKERA);
			this.listaSubtitulos.add(subEuskera);
			break;
		case 6:
			Subtitulo subIngles = new Subtitulo(autor, Idioma.INGLES);
			this.listaSubtitulos.add(subIngles);
			break;
		case 7:
			Subtitulo subAleman = new Subtitulo(autor, Idioma.ALEMAN);
			this.listaSubtitulos.add(subAleman);
			break;
		default:
			System.out.println("No existe este idioma, selecciona uno valido.");
			break;
		}

		scan.close();

	}

}
