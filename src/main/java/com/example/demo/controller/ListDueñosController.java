package com.example.demo.controller;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Dueño;
import com.example.demo.service.ServiceDueño;

@Controller
public class ListDueñosController {

	Logger l = org.apache.logging.log4j.LogManager.getLogger(IndexController.class);
	public ServiceUser serviceuser;
	public ServiceDueño serviceDueño;

	@Autowired
	public ListDueñosController(ServiceDueño serviceDueño, ServiceUser serviceUser) {
		this.serviceDueño = serviceDueño;
		this.serviceuser = serviceUser;
	}

	@GetMapping("listDuenos")
	public ModelAndView goToListDueños() {
		ModelAndView modelAndView = new ModelAndView("listDueños");
		List<Dueño> listaDueños = serviceDueño.listaDueños();

		modelAndView.addObject("listaDueños", listaDueños);

		return modelAndView;
	}

	@GetMapping("deleteDueno")
	public ModelAndView deleteDueño(@RequestParam("dni") int dni) {
		serviceDueño.borrarDueño(dni);
		ModelAndView modelAndView = new ModelAndView("listDueños");
		List<Dueño> listaDueños = serviceDueño.listaDueños();

		modelAndView.addObject("listaDueños", listaDueños);

		return modelAndView;
	}
}
