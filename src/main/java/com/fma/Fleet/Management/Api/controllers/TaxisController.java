package com.fma.Fleet.Management.Api.controllers;

import com.fma.Fleet.Management.Api.models.TaxisModel;
import com.fma.Fleet.Management.Api.services.TaxisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

//Los controller interpretan las solicitudes del cliente, invocan los servicios correspondientes
// para realizar las operaciones requeridas y devuelven las respuestas adecuadas al cliente

@CrossOrigin("*") //se utiliza para indicar al navegador que permita solicitudes desde cualquier origen

@RestController //Indica que la clase es un controlador de Spring que maneja solicitudes HTTP
@RequestMapping("/taxis")
public class TaxisController {
    //Aqui definimos las peticiones HTTP

    @Autowired
    TaxisServiceImpl taxisService;

    @GetMapping("/lista")
    public Page<TaxisModel> getTaxis(Pageable pageable) {
        return this.taxisService.getTaxis(pageable);
    }


}
