package com.fma.Fleet.Management.Api.services;

import com.fma.Fleet.Management.Api.models.TaxisModel;
import com.fma.Fleet.Management.Api.repositories.TaxisRepository;
import org.springdoc.core.converters.models.PageableAsQueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//Esta clase en particular contiene la lógica de negocio de la aplicación, es decir,
// el conjunto de reglas que determinan cómo se procesan los datos y cómo se llevan a cabo
// las operaciones, transacciones y funciones principales de la aplicación.
public class TaxisServiceImpl implements TaxisService {

    @Autowired //Se utiliza para realizar la inyección de dependencias en los servicios
    TaxisRepository taxisRepository;

    //listar todos los taxis
    @Override
    public Page<TaxisModel> getTaxis(Pageable pageable){
        return taxisRepository.findAll(pageable);

    }

    @Override
    public TaxisModel getTaxisById(Long id) {
        Boolean existTaxiId = taxisRepository.existsById(id);
        if(existTaxiId){
            return taxisRepository.findById(id).get();
        } else {
            System.out.println("Id does not exist");
            return null;
        }
    }

    @Override
    public TaxisModel getTaxisByPlate(String plate) {
       return this.taxisRepository.findByPlate(plate);
    }








}
