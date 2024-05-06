package com.fma.Fleet.Management.Api.services;

import com.fma.Fleet.Management.Api.models.TaxisModel;
import com.fma.Fleet.Management.Api.repositories.TaxisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
//Esta clase en particular contiene la lógica de negocio de la aplicación, es decir,
// el conjunto de reglas que determinan cómo se procesan los datos y cómo se llevan a cabo
// las operaciones, transacciones y funciones principales de la aplicación.
public class TaxisServiceImpl implements TaxisService {

    @Autowired //Se utiliza para realizar la inyección de dependencias en los servicios
    TaxisRepository taxisRepository;

    //listar todos los taxis
    @Override
    public ArrayList<TaxisModel> getTaxis(){
        return (ArrayList<TaxisModel>) taxisRepository.findAll();
    }



}
