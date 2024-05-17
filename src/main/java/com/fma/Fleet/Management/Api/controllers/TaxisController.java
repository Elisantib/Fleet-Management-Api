package com.fma.Fleet.Management.Api.controllers;

import com.fma.Fleet.Management.Api.models.TaxisModel;
import com.fma.Fleet.Management.Api.services.TaxisServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//Los controller interpretan las solicitudes del cliente, invocan los servicios correspondientes
// para realizar las operaciones requeridas y devuelven las respuestas adecuadas al cliente

//@CrossOrigin("*") //se utiliza para indicar al navegador que permita solicitudes desde cualquier origen

@RestController //Indica que la clase es un controlador de Spring que maneja solicitudes HTTP
@RequestMapping("/taxis")
public class TaxisController {
    //Aqui definimos las peticiones HTTP

    @Autowired
    TaxisServiceImpl taxisService;

    @GetMapping("/list")
    @Operation(summary = "Get alls taxis", description = "no params required, gets all taxis")
    public Page<TaxisModel> getTaxis(Pageable pageable) {
        return this.taxisService.getTaxis(pageable);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get taxis by id", description = "get the taxi by your id")
    public TaxisModel getTaxisById(@PathVariable Long id) {
        return this.taxisService.getTaxisById(id);
    }

    @GetMapping("/plate")
    @Operation(summary = "Get taxis by plate", description = "get the taxi by your plate")
    public TaxisModel getTaxisByPlate(@RequestParam String plate) {
        return this.taxisService.getTaxisByPlate(plate);
    }


}
