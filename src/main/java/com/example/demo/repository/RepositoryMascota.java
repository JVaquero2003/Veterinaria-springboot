package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Mascota;

public interface RepositoryMascota {

	void save(Mascota mascota);

	List<Mascota> listAllMascotas();

	void delete(int numchip);

	Mascota cogerMascotaPorNumChip(int numchip);

	void editMascota(Mascota mascota);
}
