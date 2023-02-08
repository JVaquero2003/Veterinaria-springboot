package com.example.demo.service;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.Dueño;
import com.example.demo.repository.RepositoryDueño;

@Service
public abstract class AbstractServiceDueño implements ServiceDueño {
    Logger l = org.apache.logging.log4j.LogManager.getLogger();

    public String color;

    @Autowired
    @Qualifier("listDueño")
    public RepositoryDueño repository;

    @Override
    public void guardar(Dueño dueño) {
        l.info("guardando dueño en PRODUCCION");
        dueño.color = color;
        repository.save(dueño);
    }

    @Override
    public List<Dueño> listaDueños() {
        List<Dueño> listaDuenos = repository.listAllDueños();

        return listaDuenos;
    }

    @Override
    public Dueño cogerDueñoPorDni(int dni) {
        Dueño dueño = repository.cogerDueñoPorDni(dni);

        return dueño;
    }

    @Override
    public void borrarDueño(int dni) {
        repository.borrarDueño(dni);
    }

    @Override
    public void editDueño(Dueño dueño) {
        repository.editDueño(dueño);
    }
}
