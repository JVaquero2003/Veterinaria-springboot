package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Dueño;
import com.example.demo.model.Mascota;
import com.example.demo.service.ServiceDueño;

@Controller
public class EditDueñoController {

    Logger l = org.apache.logging.log4j.LogManager.getLogger(IndexController.class);
    public ServiceUser serviceuser;
    private ServiceDueño serviceDueño;
    List<Dueño> listDueño = serviceDueño.listaDueños();

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
    public String editDueño(@ModelAttribute("dueno") Dueño dueno) {
        String mascotaAMontar = dueno.MascotasDescompuesto;
        String[] parts = mascotaAMontar.split("\\|");
        System.out.println(Arrays.asList(parts));

        int numChip = Integer.parseInt(parts[0]);
        String nombre = parts[1];
        boolean vacunacion = parts[2].equals("true") ? true : false;
        String raza = parts[3];
        Mascota mascotaFinal = new Mascota(numChip, nombre, vacunacion, raza);
        Dueño owner = new Dueño(dueno.nombre, dueno.dni, mascotaFinal);
        serviceDueño.editDueño(owner);
        l.info("Dueño editado correctamente");

        return "listDueños";

    }
}
