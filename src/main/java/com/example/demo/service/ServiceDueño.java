package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Dueño;

public interface ServiceDueño {

	void guardar(Dueño dueño);

	List<Dueño> listaDueños();

	Dueño cogerDueñoPorDni(int dni);

	void borrarDueño(int dni);

	void editDueño(Dueño dueño);
}
