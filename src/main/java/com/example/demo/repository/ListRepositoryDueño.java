package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Dueño;

@Repository("listDueño")
public class ListRepositoryDueño implements RepositoryDueño {

	static List<Dueño> list = new ArrayList<>();

	@Override
	public void save(Dueño dueño) {
		list.add(dueño);

		for (Dueño d : list) {
			System.out.println(d);
		}

		list.forEach(System.out::println);

		list.forEach((d) -> System.out.println(d));

	}

	@Override
	public List<Dueño> listAllDueños() {
		List<Dueño> lista = list;

		return lista;
	}

	@Override
	public Dueño cogerDueñoPorDni(int dni) {
		Dueño dueño = null;

		for (Dueño d : list) {
			if (d.getDni() == dni) {
				dueño = d;
			}
		}

		return dueño;
	}

	@Override
	public void borrarDueño(int dni) {
		Dueño dueño = null;

		for (Dueño d : list) {
			if (d.getDni() == dni) {
				dueño = d;
			}
		}

		list.remove(dueño);

	}

	@Override
	public void editDueño(Dueño dueño) {
		Dueño dueñoEdit = null;

		for (Dueño d : list) {
			if (d.getDni() == dueño.getDni()) {
				dueñoEdit = d;
			}
		}

		list.remove(dueñoEdit);
		list.add(dueño);

	}

}
