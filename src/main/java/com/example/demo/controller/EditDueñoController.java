package com.example.demo.controller;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Dueño;
import com.example.demo.service.ServiceDueño;

@Controller
public class EditDueñoController {

    Logger l = org.apache.logging.log4j.LogManager.getLogger(IndexController.class);
    public ServiceUser serviceuser;
    private ServiceDueño serviceDueño;

    @Autowired
    public EditDueñoController(ServiceUser serviceUser, ServiceDueño serviceDueño) {
        this.serviceuser = serviceUser;
        this.serviceDueño = serviceDueño;
    }

    @GetMapping("/editDueño")
    public ModelAndView goToEditDueño(@RequestParam("dni") int dni) {
        Dueño dueñoParaEditar = serviceDueño.cogerDueñoPorDni(dni);

        ModelAndView modelAndView = new ModelAndView("editDueño");
        modelAndView.addObject("duenoParaEditar", dueñoParaEditar);

        return modelAndView;
    }

    @PostMapping("editNewDuenoForm")
    public ModelAndView editDueño(@ModelAttribute("dueno") Dueño dueño) {
        serviceDueño.editDueño(dueño);
        ModelAndView modelAndView = new ModelAndView("listDueños");

        return modelAndView;

    }
}
