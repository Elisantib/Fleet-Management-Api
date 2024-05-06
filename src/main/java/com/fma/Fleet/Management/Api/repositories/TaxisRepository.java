package com.fma.Fleet.Management.Api.repositories;

import com.fma.Fleet.Management.Api.models.TaxisModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//se utiliza para indicar que una clase es un componente de acceso a datos
//utilizado para acceder a una base de datos o realizar operaciones de persistencia.
//Clase que nos permite hacer querys a la base de datos

public interface TaxisRepository extends JpaRepository<TaxisModel, Long> {



}
