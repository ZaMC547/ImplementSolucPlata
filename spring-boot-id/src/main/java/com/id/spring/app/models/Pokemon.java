package com.id.spring.app.models;

public class Pokemon {
	
	private String nombre;
	private String tipo;
	private String habilidad;
	private int nivelPoder;
	private char genero;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getHabilidad() {
		return habilidad;
	}
	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	public int getNivelPoder() {
		return nivelPoder;
	}
	public void setNivelPoder(int nivelPoder) {
		this.nivelPoder = nivelPoder;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
}
