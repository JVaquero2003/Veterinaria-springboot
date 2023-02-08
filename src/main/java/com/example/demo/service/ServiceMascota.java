package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Mascota;

public interface ServiceMascota {

	void guardar(Mascota mascota);

	List<Mascota> listaMascotas();

	void eliminar(int numchip);

	Mascota cogerMascotaPorNumChip(int numchip);

	void editMascota(Mascota mascota);

}
