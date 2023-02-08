package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Dueño;

public interface RepositoryDueño {

	void save(Dueño dueño);

	List<Dueño> listAllDueños();

	Dueño cogerDueñoPorDni(int dni);

	void borrarDueño(int dni);

	void editDueño(Dueño dueño);
}
