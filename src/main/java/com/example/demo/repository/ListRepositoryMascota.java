package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Mascota;

@Repository("listMascota")
public class ListRepositoryMascota implements RepositoryMascota {

	static List<Mascota> list = new ArrayList<>();

	@Override
	public void save(Mascota mascota) {
		list.add(mascota);

		for (Mascota m : list) {
			System.out.println(m);
		}

		list.forEach(System.out::println);

		list.forEach((m) -> System.out.println(m));

	}

	// método para listar todas las mascotas
	public List<Mascota> listAllMascotas() {
		List<Mascota> lista = list;

		return lista;
	}

	// Eliminar mascota por numChip
	@Override
	public void delete(int numchip) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNumChip() == numchip)
				list.remove(i);
		}
	}

	// Editar mascota
	@Override
	public void editMascota(Mascota mascota) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNumChip() == mascota.getNumChip())
				list.set(i, mascota);
		}
	}

	// Coger objeto mascota a partir del numChip
	@Override
	public Mascota cogerMascotaPorNumChip(int numchip) {
		Mascota mascota = new Mascota();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNumChip() == numchip)
				mascota = list.get(i);
		}

		return mascota;
	}

}
