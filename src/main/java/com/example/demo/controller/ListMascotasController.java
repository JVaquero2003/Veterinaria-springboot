package com.example.demo.controller;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Mascota;
import com.example.demo.service.ServiceMascota;

@Controller
public class ListMascotasController {

	Logger l = org.apache.logging.log4j.LogManager.getLogger(IndexController.class);
	public ServiceUser serviceuser;

	public ServiceMascota serviceMascota;

	@Autowired
	public ListMascotasController(ServiceMascota serviceMascota, ServiceUser serviceuser) {
		this.serviceMascota = serviceMascota;
		this.serviceuser = serviceuser;
	}

	// Listado de mascotas con posibilidad de eliminar y clicar para editar
	@GetMapping("/listMascotas")
	public ModelAndView goToListMascotas() {
		ModelAndView modelAndView = new ModelAndView("listMascotas");
		List<Mascota> listaMascotas = serviceMascota.listaMascotas();

		modelAndView.addObject("listaMascotas", listaMascotas);

		return modelAndView;
	}

	// Eliminar mascota
	@GetMapping("/deleteMascota")
	public ModelAndView deleteMascota(@RequestParam("numChip") int numChip) {
		serviceMascota.eliminar(numChip);
		ModelAndView modelAndView = new ModelAndView("deleteMascota");

		return modelAndView;
	}

}
