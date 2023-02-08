package com.example.demo.controller;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Mascota;
import com.example.demo.service.ServiceMascota;

@Controller
public class EditMascotasController {

	Logger l = org.apache.logging.log4j.LogManager.getLogger(IndexController.class);
	public ServiceUser serviceuser;
	public ServiceMascota serviceMascota;

	@Autowired
	public EditMascotasController(ServiceUser serviceUser, ServiceMascota serviceMascota) {
		this.serviceuser = serviceUser;
		this.serviceMascota = serviceMascota;
	}

	@GetMapping("/editMascota")
	public ModelAndView goToEditMascota(@RequestParam("numChip") int numChip) {
		Mascota mascotaParaEditar = serviceMascota.cogerMascotaPorNumChip(numChip);

		ModelAndView modelAndView = new ModelAndView("editMascota");
		modelAndView.addObject("mascotaParaEditar", mascotaParaEditar);

		return modelAndView;
	}

	@PostMapping("editNewMascotaForm")
	public ModelAndView editMascota(@ModelAttribute("mascota") Mascota mascota) {
		serviceMascota.editMascota(mascota);
		ModelAndView modelAndView = new ModelAndView("end");

		return modelAndView;

	}

}
