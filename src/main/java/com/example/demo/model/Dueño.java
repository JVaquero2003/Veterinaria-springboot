package com.example.demo.model;

public class Dueño {

	public String nombre;
	public int dni;
	public Mascota mascota;
	public String MascotasDescompuesto;

	public Dueño() {
		super();
	}

	public Dueño(String nombre, int dni, Mascota mascota) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.mascota = mascota;
	}

	public Dueño(String nombre, int dni, String MascotasDescompuesto) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.MascotasDescompuesto = MascotasDescompuesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public String getMascotasDescompuesto() {
		return MascotasDescompuesto;
	}

	public void setMascotasDescompuesto(String mascotasDescompuesto) {
		MascotasDescompuesto = mascotasDescompuesto;
	}

	@Override
	public String toString() {
		return "Dueño [nombre=" + nombre + ", dni=" + dni + ", ChipMascota=" + mascota.getNumChip() +
				", NombreMascota=" + mascota.getNombre() + ", VacunaMascota=" + mascota.isVacunacion() + "]";
	}

}
