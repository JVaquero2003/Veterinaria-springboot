package com.example.demo.model;

public class Mascota {

	private int numChip;
	private String nombre;
	private boolean vacunacion;
	public String raza;

	public Mascota(int numChip, String nombre, boolean vacunacion, String raza) {
		this.numChip = numChip;
		this.nombre = nombre;
		this.vacunacion = vacunacion;
		this.raza = raza;
	}

	public Mascota() {
		super();
	}

	public Mascota(int numChip, String nombre, boolean vacunacion) {
		super();
		this.numChip = numChip;
		this.nombre = nombre;
		this.vacunacion = vacunacion;
	}

	public int getNumChip() {
		return numChip;
	}

	public void setNumChip(int numChip) {
		this.numChip = numChip;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isVacunacion() {
		return vacunacion;
	}

	public void setVacunacion(boolean vacunacion) {
		this.vacunacion = vacunacion;
	}

	@Override
	public String toString() {
		return numChip + "|" + nombre + "|" + vacunacion + "|" + raza;
	}

}
