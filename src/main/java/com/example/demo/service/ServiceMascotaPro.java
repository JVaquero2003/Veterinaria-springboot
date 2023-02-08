package com.example.demo.service;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.demo.model.Mascota;
import com.example.demo.repository.RepositoryMascota;

@Profile("Pro")
@Service
public class ServiceMascotaPro implements ServiceMascota {

	Logger l = org.apache.logging.log4j.LogManager.getLogger();

	@Autowired
	@Qualifier("listMascota")
	public RepositoryMascota repository;

	@Override
	public void guardar(Mascota mascota) {
		l.info("guardando mascota en PRODUCCION");
		repository.save(mascota);
	}

	public List<Mascota> listaMascotas() {
		List<Mascota> listaMasc = repository.listAllMascotas();

		return listaMasc;
	}

	@Override
	public void eliminar(int numchip) {
		l.info("eliminando mascota de la lista");
		repository.delete(numchip);
	}

	// metodo que edita la mascota y la actualiza en la lista

	@Override
	public void editMascota(Mascota mascota) {
		l.info("editando mascota");
		repository.editMascota(mascota);
	}

	@Override
	public Mascota cogerMascotaPorNumChip(int numchip) {
		Mascota mascota = repository.cogerMascotaPorNumChip(numchip);

		return mascota;
	}

}
